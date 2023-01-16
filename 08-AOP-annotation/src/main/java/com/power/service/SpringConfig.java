package com.power.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//全注解开发
@Configuration
@ComponentScan("com.power")
@EnableAspectJAutoProxy(proxyTargetClass = true)//启用自动代理机制
public class SpringConfig {

}
