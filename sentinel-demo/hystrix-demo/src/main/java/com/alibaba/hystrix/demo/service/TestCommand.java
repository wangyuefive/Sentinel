package com.alibaba.hystrix.demo.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixCommandProperties;

/**
 * 封装Hystrix command对象，
 */
public class TestCommand extends HystrixCommand<String> {

    public TestCommand() {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("group_a"))
            // command 定义
            .andCommandKey(HystrixCommandKey.Factory.asKey("test_command"))
            // 规则配置
            .andCommandPropertiesDefaults(HystrixCommandProperties.defaultSetter()
                .withCircuitBreakerEnabled(true)
                .withFallbackEnabled(true)
                .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.THREAD)
            )
        );
    }

    @Override
    protected String run() throws Exception {
        // 真正需要保护的逻辑
        return "helloworld";
    }

    @Override
    protected String getFallback() {
        // 定义降级的处理
        return "some fallback";
    }
}
