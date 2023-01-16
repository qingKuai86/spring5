package com.power.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect //切面类需要@Aspect注解标注
@Order(2)
public class LogAspect {//切面类

    //切面=切点+通知


    //定义通用的切点表达式
    @Pointcut("execution(* com.power.service..*())")
    public void commonEpcession(){
        //这个方法只是一个标记，方法名随意，方法体中也不需要写任何代码。
    }
    @Before("commonEpcession()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("前置通知");
        //这个JoinPoint joinPoint，在Spring 容器调用这个方法的时候自动传过来。
        //我们可以直接用。用这个JoinPoint joinPoint 干啥?
        // Signature signature = joinPoint . getsignature();获取目标方法的签名。
        //通过方法的签名可以获取到-一个方法的具体信息。
        //获取目标方法的方法名。
        System.out.println("目标方法的方法名："+joinPoint.getSignature().getName());
    }

        //前置通知
    //@Before("execution(* com.power.service..*())")
    @Before("commonEpcession()")
    public void preAdvice(){
        System.out.println("前置通知");
    }
    //后置通知
    //@AfterReturning("execution(* com.power.service..*())")
    @AfterReturning("commonEpcession()")
    public void aftReAdvice(){
        System.out.println("后置通知");
    }
    //环绕通知( 环绕是最大的通知，在前置通知之前， 在后置通知之后。)
    @Around("commonEpcession()")
    public void aroundAdvice(ProceedingJoinPoint JoinPoint) throws Throwable {
        //前面的代码
        System.out.println("环绕通知开始");
        // 执行目标方法。
        JoinPoint.proceed();
        //后面的代码
        System.out.println("环绕通知结束");
    }
    //最终通知
    @After("commonEpcession()")
    public void aftAdvice(){
        System.out.println("最终通知");
    }
    @AfterThrowing("commonEpcession()")
    public void throwAdvice(){
        System.out.println("异常通知");
    }
}
