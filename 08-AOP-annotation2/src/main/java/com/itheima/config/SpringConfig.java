package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.itheima")
//使用@Import注解手动加入配置类到核心配置,此注解只能添加一次,多个数据请用大括号包起来
@Import(jdbcConfig.class)
public class SpringConfig {

}