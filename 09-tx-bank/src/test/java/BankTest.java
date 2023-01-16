import com.alibaba.druid.pool.DruidDataSource;
import com.power.dao.AccountDao;
import com.power.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


import java.sql.Connection;

public class BankTest {
    @Test
    public void testTransfer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-1", "act-2", 1000);
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AccountDao accountDao = context.getBean("accountDao",AccountDao.class);
        System.out.println();
        System.out.println(accountDao.selectByActno("act-1"));
    }
    @Test
    public void testDruid() throws Exception {
        //创建数据源
        DruidDataSource dataSource = new DruidDataSource();
        //设置数据库连接参数
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        //获得连接对象
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    public void testJDBCTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
        System.out.println(jdbcTemplate);

    }

}