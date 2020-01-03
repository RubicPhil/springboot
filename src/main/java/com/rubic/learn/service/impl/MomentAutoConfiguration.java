package com.rubic.learn.service.impl;

import com.rubic.learn.service.MomentService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MomentAutoConfiguration
 *
 * @Author yuanqinxian@corp.netease.com
 * @Create in 2019/12/26
 */
@Configuration
@ConditionalOnClass(MomentService.class)
public class MomentAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(name = "realMoment")
    public MomentService configReader() throws Exception {
        ToRealMomentServiceImpl toRealMomentService = new ToRealMomentServiceImpl("rubic");
        return toRealMomentService;
    }
}
