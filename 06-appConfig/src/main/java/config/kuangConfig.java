package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pojo.User;

@Configuration
//@ComponentScan("pojo")
//@Import(kuangConfig2.class)
public class kuangConfig {
/*
    @Bean
    public User getUser(){
        return new User();
    }
*/
    @Bean
    public User user(){
        return new User();
    }
}
