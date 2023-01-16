import com.alibaba.druid.pool.DruidDataSource;
import com.power.dao.AccountDao;
import com.power.service.AccountService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


import java.sql.Connection;

public class test10_Test {
    @Test
    public void testTransfer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-01", "act-02", 1000);
            System.out.println("转账成功");
        } catch (Exception e) {
            System.out.println("转账失败");
        }

    }
    @Test
    public void testAddAccount(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.addAccount("act-03",1000);
            System.out.println("添加账户成功");
        }catch (Exception e){
            System.out.println("添加失败");
        }

    }
    @Test
    public void testLog() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(111);
        Logger logger = LoggerFactory.getLogger(test10_Test.class);
        logger.info("我是一条日志信息。。。");
    }


}