package com.power.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {//安全切面类


    //@Before("execution(* com.power.service..*())")
    //通用切点跨类使用需加全类名
    @Before("com.power.service.LogAspect.commonEpcession()")
    public void preAdvice(){
        System.out.println("前置通知:安全");
    }
}
