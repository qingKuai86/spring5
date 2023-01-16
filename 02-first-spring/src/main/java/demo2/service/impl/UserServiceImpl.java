package demo2.service.impl;

import demo2.dao.UserDao;
import demo2.dao.impl.UserDaoImplForOracle;
import demo2.service.UserService;

public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImplForMySQL();
    //修改为
    private UserDao userDao = new UserDaoImplForOracle();

    //private UserDao userDao;
    @Override
    public void deleteUser() {
        userDao.deleteById();
    }
}
