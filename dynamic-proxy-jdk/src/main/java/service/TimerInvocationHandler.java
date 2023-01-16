package service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimerInvocationHandler implements InvocationHandler {

    private Object target;

    public TimerInvocationHandler(Object target) {
        this.target = target;
    }
    /*
    1.为什么强行要求你必须实现InvocationHandler接口?
    因为一个类实现接口就必须实现接口中的方法。
    以下这个方法必须是invoke(),因为JDK 在底层调invoke()方法的程序已经提前写好了。
    注意: invoke 方法不是我们程序员负责调用的，是JDK 负责调用的。

    2. invoke 方法什么时候被调用呢?
    当代理对象调用代理方法的时候，注册在InvocationHandler调用处理器当中的invoke()方法被调用。

    3.invoke方法的三个参数
        invoke方法是JDK负责调用的，所以JDK调用这个方法的时候会自动给我们传过来这三个参数。
        我们可以在invoke方法中直接使用。
            第一个参数: 0bject proxy代理对象的引用。这个参数使用较少。
            第二个参数: Method method 目标对象上的目标方法。(要执行的目标方法就是它。)
            第三个参数: 0bject[] args目标方法上的实参。

*/

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 这个接口的目的就是为了让你有地方写增强代码。

        long begin = System.currentTimeMillis();

        //执行目标对象的目标方法
        Object retValue = method.invoke(target,args);

        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
        //如果目标对象的目标方法有返回值，这个地方一定要返回
        return retValue;
    }
}
