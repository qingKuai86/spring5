package test1;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionTest {
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        InjectionService service = context.getBean("injectionServiceImpl",InjectionServiceImpl.class);
        service.save("this is autowired");
    }
}
