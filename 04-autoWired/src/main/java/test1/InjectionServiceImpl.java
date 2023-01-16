package test1;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {
    @Resource(name="injectionDAO")
    private InjectionDAO injectionDAO;
    @Override
    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接受参数："+arg);
        arg = arg+this.hashCode();
        injectionDAO.save(arg);
    }
}