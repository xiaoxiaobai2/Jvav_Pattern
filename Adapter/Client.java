package Adapter;

/**
 * 适配器设计模式
 * @author 张浩
 * @date 2019.09.19
 */
public class Client {
    public void test(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client client=new Client();
        //继承的方式实现
        System.out.println("继承的方式实现：");
        Target t=new Adapter();
        client.test(t);

        //组合的方式实现
        System.out.println("组合的方式实现：");
        Adaptee adaptee=new Adaptee();
        Target t2=new Adapter2(adaptee);//传递被适配对象
        client.test(t2);
    }
}
