package demo2.web;

import demo2.service.UserService;

/*
* 表示层
* */
public class UserAction {

    //private UserService userService = new UserServiceImpl();

    private UserService userService;


    /**
     *  删除用户信息的请求
     * */
    public void deleteRequest(){
        userService.deleteUser();
    }

}
