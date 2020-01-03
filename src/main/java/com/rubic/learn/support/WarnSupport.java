package com.rubic.learn.support;

import org.springframework.stereotype.Component;

/**
 * WarnSupport
 *
 * @Author yuanqinxian@corp.netease.com
 * @Create in 2019/12/20
 */
@Component
public class WarnSupport {

    public void warn() {
        System.out.println("Warning warning warning...");
    }

    public void info() {
        System.out.println("letting letter lit");
    }

}
