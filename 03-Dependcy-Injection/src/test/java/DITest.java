import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class DITest {
    @Test
    public void saveUserTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        UserService userService = context.getBean("userServiceBean",UserService.class);

        userService.saveUser();
        userService.deleteUser();
    }
}
