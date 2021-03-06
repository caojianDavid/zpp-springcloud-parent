package org.zpp.auth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zpp
 * @date 2019/8/14 16:30
 */
@RestController
public class TestController {

    @Value("${security.social.weixin.app-id}")
    private String id;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test: "+id;
    }
}
