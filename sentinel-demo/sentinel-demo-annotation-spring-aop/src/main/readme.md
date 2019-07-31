> 此demo演示两处：
> * 基于AOP切面的限流控制
> * 基于URL的限流控制

# 启动
> idea启动的时候，添加jvm参数：-Dcsp.sentinel.dashboard.server=127.0.0.1:8999 -Dproject.name=sentinel_demo
> * -Dcsp.sentinel.dashboard.server: 指定控制台的地址
> * -Dproject.name:指定在控制台显示的应用名称