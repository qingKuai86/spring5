package demo2.test;

import demo2.web.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring5 {

    @Test
    public void Test(){
        //1.加载spring加载文件
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/bean2.xml");
        //2.获取配置创建的对象
        //UserAction userAction = (UserAction) context.getBean("UserAction");
        UserAction userAction = context.getBean("UserAction",UserAction.class);
        userAction.deleteRequest();
    }
}
