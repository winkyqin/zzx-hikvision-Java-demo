# HIKVISION JAVA DEMO

## 项目包结构

### callback
- EventMsgNetWorker (EventMsgNetWorker)
- EventCallBack (事件回调)
- EventCallBackType (事件回调类型)

### config
- commandbuilder
  - CommandAssembly
  - CommandAssemblyImpl
  - CommandBuilder
  - CommandBuilderFactory
  - DefaultCommandBuilder

### constants
- log
  - LogNavbarType
  - LogSucceed
  - LogType
- ErrorCodeConsts
- ExamReportConsts
- NormalUserConsts
- ProjectStatusConsts
- RegConsts
- ShiroConsts
- SMSContentConsts

### controller
- web (海康摄像头模块)
    - login
    - live （window,获取实时视频流）
    - getLiveStreamByIp （windows 获取实时视频流）
    - history （windows 获取历史视频流）
    - closeLive （windows 关闭视频流）
    - linuxGetLiveStreamByIp （linux，获取实时视频流）
    - linuxHistory （linux，获取历史视频流）
    - linuxCloseLive （linux，关闭视频流）
    - playback （下载文件版回放 耗时较长，建议使用rtsp协议版）
    - videoPlay
    - playControl
    - winGetChannelNumByIp （返回通道数，要根据这个通道数组装成 102,101这种通道流去找nvr要数据）
    - linuxGetChannelNumByIp （返回通道数，要根据这个通道数组装成 102,101这种通道流去找nvr要数据）
    - CreateDeviceChannel （建立设备通道数）
    - getChannelNumber （从设备树获取通道号）
    
    
### data
- CommandTasker
- TaskDAO
- TaskDaoImpl
- TaskerEventMsg

### DTO
- request
- response

### enumeration
- HKPlayControlEnum
- ResultEnum
- ShiroErrorEnum

### exception
- GlobalException

### filter
- SimpleCORSFiler

### handler
- DefaultOutHandlerMethod (默认任务消息输出处理)
    - KeepAliveHandler (任务保活处理器)
    - OutHandler (任务消息输出处理器)
    - OutHandlerMethod (输出消息处理)
    - TaskHandler (任务执行接口)
    - TaskHandlerImpl (任务处理实现)

### schedule
- AutoKillTask

### service
### test 
### util
### CommandManager
- CommandManagerImpl
    - TaskDao
    - TaskHandler
    - CommandAssembly
    - OutHandlerMethod

### HkwsApplication
