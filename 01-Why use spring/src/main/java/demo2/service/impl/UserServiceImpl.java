package demo2.service.impl;

import demo2.dao.UserDao;
import demo2.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImplForMySQL();
    //修改为
    //private UserDao userDao = new UserDaoImplForOracle();

    private UserDao userDao;

    public UserServiceImpl() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        userDao = (UserDao) applicationContext.getBean("UserDaoImplForOracle");
    }

    @Override
    public void deleteUser() {
        userDao.deleteById();
    }
}
