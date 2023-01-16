import com.power.service.OrderService;
import com.power.service.SpringConfig;
import com.power.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    //1.半注解开发测试
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userService",UserService.class);
        //userService.login();
        //userService.logout();


        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.genre();
    }
    //2.全注解开发测试
    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        userService.login();
    }
}
