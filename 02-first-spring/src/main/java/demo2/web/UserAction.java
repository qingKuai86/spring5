package demo2.web;

import demo2.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* 表示层
* */
public class UserAction {

    //private UserService userService = new UserServiceImpl();

    private UserService userService;

    public UserAction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/bean2.xml");
        userService = (UserService) applicationContext.getBean("UserServiceImpl");
    }

    /**
     *  删除用户信息的请求
     * */
    public void deleteRequest(){
        userService.deleteUser();
    }

}
