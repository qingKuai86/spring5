package com.power.dao.impl;

import com.power.dao.AccountDao;
import com.power.pojo.Account;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Resource(name="jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectByActno(String accountid) {
        String sql = "select accountid, balance from accountT where accountid = ?";
        //System.out.println(jdbcTemplate);
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), accountid);
        //Account account = new Account();
        return account;
    }

    @Override
    public int updateAccount(Account act) {
        String sql = "update accountT set balance = ? where accountid = ?";
        int count = jdbcTemplate.update(sql, act.getBalance(), act.getAccountid());
        return count;
    }

    @Override
    public int addAccount(Account account) {
        String sql = "INSERT INTO accountT (accountid, balance) VALUES (?, ?)";
        int count = jdbcTemplate.update(sql, account.getAccountid(),account.getBalance());
        return count;
    }
}
