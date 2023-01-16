package demo2.test;

import demo2.web.UserAction;


public class TestSpring5 {

    public void Test(){
        //1.加载spring加载文件
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        UserAction userAction = new UserAction();
        userAction.deleteRequest();
    }
}
