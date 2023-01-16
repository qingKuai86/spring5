import config.kuangConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class myTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(kuangConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.toString());

    }
}
