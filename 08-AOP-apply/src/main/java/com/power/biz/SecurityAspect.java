package com.power.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class SecurityAspect {


    @Pointcut("execution(* com.power.biz..save*(..))")
    public void savePointcut(){}

    @Pointcut("execution(* com.power.biz..delete*(..))")
    public void deletePointcut(){}

    @Pointcut("execution(* com.power.biz..modify*(..))")
    public void modifyPointcut(){}

    @Before("savePointcut() || deletePointcut() || modifyPointcut()")
    public void BeforeAdvice(JoinPoint joinPoint){
        //系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTime = sdf.format(new Date());
        //输出日志信息
        System.out.println(nowTime+" 张三 : "+joinPoint.getSignature().getDeclaringTypeName()+
                "."+joinPoint.getSignature().getName());
        //获取代理对象
        System.out.println(joinPoint.getThis());
        //获取目标对象
        System.out.println(joinPoint.getTarget());
        //获取代理对象的类名
        System.out.println(joinPoint.getThis().getClass().getName());
        //获取目标对象的类名
        System.out.println(joinPoint.getTarget().getClass().getName());

    }
}
