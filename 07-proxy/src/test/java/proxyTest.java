public class proxyTest {

    public static void main(String[] args) {


        /*OrderService orderService = new OrderServiceImpl();
        orderService.generate();
        orderService.detail();
        orderService.modify();*/

       /* OrderService orderService = new OrderServiceSub();
        orderService.generate();
        orderService.detail();
        orderService.modify();*/

        //创建目标对象
        OrderServiceImpl target = new OrderServiceImpl();
        //创建代理对象
        OrderServiceProxy proxy = new OrderServiceProxy(target);
        //调用代理对象的代理方法
        proxy.generate();
        proxy.detail();
        proxy.modify();
    }
}
