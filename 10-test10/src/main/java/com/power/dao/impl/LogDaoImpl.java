package com.power.dao.impl;

import com.power.dao.LogDao;
import com.power.pojo.Log;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("logDao")
public class LogDaoImpl implements LogDao {
    @Resource(name="jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    // 定义构造函数和setter方法

    public void addLog(Log log) {
        String sql = "INSERT INTO LogT (operation, parameters, result, exception) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, log.getOperation(), log.getParameters(), log.getResult(), log.getException());
    }
}

