package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("小明")
    private String name;

    public User() {
        System.out.println("构造方法执行。");
    }

    public void setName(String name) {
        System.out.println("set方法执行。");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
