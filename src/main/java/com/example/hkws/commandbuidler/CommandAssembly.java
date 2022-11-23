package com.example.hkws.commandbuidler;

import java.util.Map;

/**
 * 命令组装器接口
 *
 * @author eguid
 * @version 2016年10月29日
 * @since jdk1.7
 */
public interface CommandAssembly {
    /**
     * 将参数转为ffmpeg命令
     *
     * @param paramMap
     * @return
     */
    public String assembly(Map<String, String> paramMap);

    public String assembly();
}
