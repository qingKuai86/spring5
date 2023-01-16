package com.power.service.impl;

import com.power.dao.AccountDao;
import com.power.pojo.Account;
import com.power.service.AccountService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    @Transactional
    //转账
    public void transfer(String fromActno, String toActno, double money) {
        // 查询账户余额是否充足
        Account fromAct = accountDao.selectByActno(fromActno);
        if (fromAct.getBalance() < money) {
            throw new RuntimeException("账户余额不足");
        }
        // 余额充足，开始转账
        Account toAct = accountDao.selectByActno(toActno);
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);
        int count = accountDao.updateAccount(fromAct);
        //模拟异常
      /*
        String s = null;
        s.toString();
      */
        count += accountDao.updateAccount(toAct);
        if (count != 2) {
            throw new RuntimeException("转账失败，请联系银行");
        }
    }

    @Override
    @Transactional
    //添加账户
    public void addAccount(String accountid, double balance) {
        Account account = new Account(accountid,balance);
        accountDao.addAccount(account);
    /*    //模拟异常
        String s = null;
        s.toString();*/
    }
}