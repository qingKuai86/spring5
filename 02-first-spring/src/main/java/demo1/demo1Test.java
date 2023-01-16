package demo1;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo1Test {
    public static void main(String[] args) {
        //1.加载spring加载文件
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/bean1.xml");
        //2.获取配置创建的对象
        //User user = (User) context.getBean("User");
        User user = context.getBean("User",User.class);
        // user.add();
    }
    @Test
    public void Log4jTest(){
        //1.加载spring加载文件
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/bean1.xml");
        //2.获取配置创建的对象
        User user = context.getBean("User",User.class);

        //自己怎么去使用log4j2记录日记信息呢？
        //第一步：创建日记记录器对象
        //获取demo1Test类的日志记录器对象，也就是说只要demo1Test类中的代码执行记录日志的话，就输出相关的日志信息。
        Logger logger = LoggerFactory.getLogger(demo1Test.class);
        logger.info("我是一条日志消息");
        logger . debug("我是一一条调试信息");
        logger . error("我是一条错 误信息");
    }
}
