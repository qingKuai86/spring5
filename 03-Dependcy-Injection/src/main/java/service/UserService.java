package service;

import dao.UserDao;
import dao.VipDao;

public class UserService {

    private UserDao userDao;

    private VipDao vipDao;

    public UserService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void saveUser(){
        //保存用户信息到数据库
        userDao.insert();
    }
    public void deleteUser(){
        //删除用户信息
        vipDao.delete();
    }

    //set方法，用来set注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
