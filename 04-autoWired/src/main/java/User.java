import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String name;
    @Autowired
    private Stu stu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stu getStu() {
        return stu;
    }

    public void setStu(Stu stu) {
        this.stu = stu;
    }

    public User() {
        System.out.println("user构造方法执行。");
    }
}
