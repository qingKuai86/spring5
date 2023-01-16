package myPackage.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

// @Component组件
//等价于<bean id= "user" cLass= "myPackage. pojo. User"/>

/*
衍生的注解
        @Component有几个衍生注解,我们在web开发中，会按照mvc三层架构分层!
        -dao   [@Repository] .
        -service [@Service]
        -controller [@Controller]
        这四个注解功能都是一样的， 都是代表将某个类注册到Spring中,装配Bean
*/

@Component
@Scope("prototype")
public class User {

    //相当于<property name= "name" value= "小明"/>
    @Value("小明")
    private String name;

/*    public User() {
        System.out.println("构造方法执行。");
    }

    public void setName(String name) {
        System.out.println("set方法执行。");
        this.name = name;
    }*/

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        User user = context.getBean("user",User.class);
        System.out.println(user.name);
    }
}
