package service;

public class OrderServiceImpl implements OrderService{
    @Override
    public String getName() {
        System.out.println("getName()方法执行了。");
        return "张三";
    }

    @Override
    public void generate() {
        try{
            Thread.sleep(1234);
        }catch (Exception e){

        }
        System.out.println("订单一生成。");

    }

    @Override
    public void modify() {
        try{
            Thread.sleep(456);
        }catch (Exception e){

        }
        System.out.println("订单已修改。");
    }

    @Override
    public void detail() {
        try{
            Thread.sleep(1111);
        }catch (Exception e){

        }
        System.out.println("查看订单详情。");
    }
}
