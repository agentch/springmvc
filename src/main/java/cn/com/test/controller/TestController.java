package cn.com.test.controller;

import cn.com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return testService.test();
    }

}
