package com.rubic.learn.service.impl;

import com.rubic.learn.service.MomentService;
import com.rubic.learn.support.CircleSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * MomentServiceImpl
 *
 * @Author yuanqinxian@corp.netease.com
 * @Create in 2019/12/20
 */
@Component("realMoment")
public class RealMomentServiceImpl extends AbstractMomentServiceImpl {

    @Resource
    private CircleSupport circleSupport;


    @Override
    protected void realCircle() {
        System.out.println("Real circle starting ...");
        circleSupport.circle();
    }
}
