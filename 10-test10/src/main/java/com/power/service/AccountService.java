package com.power.service;

/*
* 业务接口
* 事务就是在这个接口下控制的。
* */
public interface AccountService {

    /**
     * 转账
     * @param fromActno
     * @param toActno
     * @param money
     */
    void transfer(String fromActno, String toActno, double money);
    void addAccount(String accountid, double balance);
}
