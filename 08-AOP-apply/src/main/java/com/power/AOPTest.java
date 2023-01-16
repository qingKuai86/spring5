package com.power;

import com.power.biz.UserService;
import com.power.biz.VipService;
import com.power.service.AccountService;
import com.power.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
        @Test
        public void testSecurityLog(){
            ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            UserService userService = context.getBean("userService",UserService.class);
            userService.saveUser();

            VipService vipService = context.getBean("vipService",VipService.class);
            vipService.deleteVip();

        }

        @Test
        public void testTransaction(){
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
            OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
            AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
            // 生成订单
            orderService.generate();
            // 取消订单
            orderService.cancel();
            // 转账
            accountService.transfer();
            // 取款
            accountService.withdraw();
        }
}
