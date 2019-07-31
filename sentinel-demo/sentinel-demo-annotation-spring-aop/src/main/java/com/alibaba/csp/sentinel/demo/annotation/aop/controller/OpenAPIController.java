package com.alibaba.csp.sentinel.demo.annotation.aop.controller;

import org.springframework.web.bind.annotation.*;

/**
 * 测试filter作为限流组件
 *
 * @author gengnan.wy
 * @date 2019-07-31
 */
@RestController
@RequestMapping("/openapi")
public class OpenAPIController {

    @GetMapping("/works/{type}")
    public String getTest( @PathVariable("type") String type,
                           @RequestParam("name") String name) {
        String result = String.format("hello, %s, your type is %s, now time is: %s", name, type, System.currentTimeMillis());
        return result;
    }
}
