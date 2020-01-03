package com.rubic.learn.service.impl;

import com.rubic.learn.service.MomentService;
import com.rubic.learn.support.WarnSupport;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * AbstractMomentServiceImpl
 *
 * @Author yuanqinxian@corp.netease.com
 * @Create in 2019/12/20
 */
public abstract class AbstractMomentServiceImpl implements MomentService {

    @Resource
    public WarnSupport warnSupport;

    @Override
    public void memory() {
        warnSupport.info();
        System.out.println("In order to transition from tools to collaborators, artificial intelligence (AI) systems " +
                "require the ability to store memories, and apply them to new situations via analogy.");
    }

    @Override
    @Transactional
    public void clear() {
        warnSupport.warn();
        System.out.println("After a nap, “Your hippocampal informational inbox of memory email is now cleared out.”");
        realCircle();
    }

    protected abstract void realCircle();
}
