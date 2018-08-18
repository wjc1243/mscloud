package com.wjc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    //默认轮询算法，此处可自己选择算法
    public IRule myRule(){
        //return new RandomRule();随机算法
        return new RandomRule_WJC();//自定义算法，每个机器访问三次
    }
}
