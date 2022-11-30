# HIKVISION JAVA DEMO

## 项目结构

### callback
### config
### constants
### controller
- web (海康摄像头模块)
    - login
    - live
    - getLiveStreamByIp
    - history
    - closeLive
    - linuxGetLiveStreamByIp
    - linuxHistory
    - linuxCloseLive
    - playback
    - videoPlay
    - playControl
    - winGetChannelNumByIp （返回通道数，要根据这个通道数组装成 102,101这种通道流去找nvr要数据）
    - linuxGetChannelNumByIp （返回通道数，要根据这个通道数组装成 102,101这种通道流去找nvr要数据）
    - CreateDeviceChannel （建立设备通道数）
    - getChannelNumber （从设备树获取通道号）
    
    
### data
### DTO
### enumeration
### exception
### filter
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
