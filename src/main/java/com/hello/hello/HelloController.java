package com.hello.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "hello")
    @ResponseBody
    public String hello() {
        return "Hello world";
    }
}
