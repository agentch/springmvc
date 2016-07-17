package cn.com.test.controller;

import cn.com.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("test")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return testService.test();
    }

    @RequestMapping(value = "test2", method = RequestMethod.GET)
    @ResponseBody
    public Integer test2(String s) {
        try {
            Integer i = Integer.parseInt(s);
            return i;
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error(e.getMessage(), e);
                return 0;
            }
        }
        return -1;
    }

}
