package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : zw
 * @email : zsky@live.com,
 * @date : 2019/6/28 14:47.
 * @motto : To be, or not to be.
 */
@Controller
@RequestMapping("/mvc")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
