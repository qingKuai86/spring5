package test1;


import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {

        @Override
        public void save(String arg) {
            //模拟数据库操作
            System.out.println("保存数据1："+arg);
        }
}

