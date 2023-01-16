public class OrderServiceImpl implements OrderService{

    /*public void generate() {
        long begin = System.currentTimeMillis();
        try{
            Thread.sleep(1234);
        }catch (Exception e){

        }
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
        System.out.println("订单一生成。");

    }*/
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
