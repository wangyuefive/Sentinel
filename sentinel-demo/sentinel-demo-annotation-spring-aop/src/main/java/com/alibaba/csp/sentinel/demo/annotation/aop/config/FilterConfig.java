package com.alibaba.csp.sentinel.demo.annotation.aop.config;

import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * 对Web资源进行处理
 *
 * @author gengnan.wy
 * @date 2019-07-31
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<Filter> sentinelFilterRegistration() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CommonFilter());
        registration.addUrlPatterns("/openapi/*");
        registration.setName("sentinelFilter");
        registration.setOrder(1);

        return registration;
    }
}
