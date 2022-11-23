package com.example.hkws.handler;

import com.example.hkws.schedule.AutoKillTask;
import lombok.extern.slf4j.Slf4j;

/**
 * 默认任务消息输出处理
 *
 * @author eguid
 * @version 2017年10月13日
 * @since jdk1.7
 */
@Slf4j
public class DefaultOutHandlerMethod implements OutHandlerMethod {

    /**
     * 任务是否异常中断，如果
     */
    public boolean isBroken = false;


    @Override
    public void parse(String id, String msg) {
        //过滤消息
        if (msg.indexOf("fail") != -1) {
            log.info(id + "任务可能发生故障：" + msg);
            log.info("失败，设置中断状态");
            isBroken = true;
        } else if (msg.indexOf("miss") != -1) {
            log.info(id + "任务可能发生丢包：" + msg);
            isBroken = true;
        } else if (msg.indexOf("Failed to update header with correct ") != -1) {
            log.info(id + "摄像头可能已经连不上了，请检查" + msg);
            AutoKillTask.taskIdSet.add(id);
            isBroken = false;
        } else {
            isBroken = false;
            log.info(id + "消息：" + msg);
        }
    }

    @Override
    public boolean isbroken() {
        return isBroken;
    }

}
