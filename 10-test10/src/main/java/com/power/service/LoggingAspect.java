package com.power.service;

import com.power.dao.AccountDao;
import com.power.dao.LogDao;
import com.power.pojo.Account;
import com.power.pojo.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class LoggingAspect {

    @Resource(name="logDao")
    private LogDao logDao;

    @Pointcut("execution(* com.power.dao.impl.AccountDaoImpl.addAccount(..))")
    public void addAccountPointcut() {}

    @Pointcut("execution(* com.power.dao.impl.AccountDaoImpl.updateAccount(..))")
    public void updateAccountPointcut() {}

    @After("addAccountPointcut()||updateAccountPointcut()")
    public void logAfterAddAccount(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Account account = (Account) args[0];
        String Operation = joinPoint.getSignature().getName();

        Log log = new Log();
        log.setOperation(Operation);
        log.setParameters(account.toString());
        //写入数据库日志
        logDao.addLog(log);
        // 使用log4j实现屏幕输出
        Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
        logger.info("Add account: " + log.toString());

    }

}
