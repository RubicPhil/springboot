package com.rubic.learn.service.impl;

import com.rubic.learn.service.MomentService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * ToRealMomentServiceImpl
 *
 * @Author yuanqinxian@corp.netease.com
 * @Create in 2019/12/26
 */
public class ToRealMomentServiceImpl implements MomentService {

    private String desc;

    public ToRealMomentServiceImpl(String desc) {
        this.desc = desc;
    }

    @Override
    public void memory() {
        System.out.println(desc + " : Hello memory!");
    }

    @Override
    public void clear() {
        System.out.println(desc + " : Clear everything!");
    }
}
