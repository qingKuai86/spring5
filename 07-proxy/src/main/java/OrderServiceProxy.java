
//静态代理模式
public class OrderServiceProxy implements OrderService{
    //将目标对象作为代理对象的一个属性，这种叫关联关系，比继承关系耦合度低
    //注意：这里要写一个公共接口类型，因为公共接口耦合度低。

    private OrderService target; //这就是目标对象，目标对象一定是实现了OrderService公共接口的

    //创建代理对象的时候，传一个目标对象给代理对象
    public OrderServiceProxy(OrderService target) {
        this.target = target;
    }

    @Override
    public void generate() {
        //增强（及附加操作、额外操作）
        long begin = System.currentTimeMillis();
        //调用目标对象的方法
        target.generate();
        //增强
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        target.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        target.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }
}
