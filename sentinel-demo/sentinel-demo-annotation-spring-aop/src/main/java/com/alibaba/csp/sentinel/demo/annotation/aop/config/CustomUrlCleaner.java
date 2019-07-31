package com.alibaba.csp.sentinel.demo.annotation.aop.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlCleaner;

/**
 * 接口清洗
 *
 * @author gengnan.wy
 * @date 2019-07-31
 */
public class CustomUrlCleaner implements UrlCleaner {

    @Override
    public String clean(String originUrl) {
        if (originUrl.startsWith("/openapi/works")) {
            return "/openapi/works/*";
        }
        return originUrl;
    }
}
