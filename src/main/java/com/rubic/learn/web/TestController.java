package com.rubic.learn.web;

import com.rubic.learn.service.MomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TestController
 *
 * @Author yuanqinxian@corp.netease.com
 * @Create in 2019/12/20
 */
@RestController
public class TestController {

    @Autowired
    @Qualifier("realMoment")
    private MomentService momentService;

    @RequestMapping("/api/rubic/bank/get")
    public void get() throws InterruptedException {
        momentService.memory();
        Thread.sleep(2600);
        momentService.clear();
    }

}
