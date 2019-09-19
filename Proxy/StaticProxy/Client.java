package Proxy.StaticProxy;

/**
 * 代理设计模式
 *      静态代理
 * @author 张浩
 * @date 2019.09.19
 */
public class Client {
    public static void main(String[] args) {
        Star real=new RealStar("周杰伦");
        Star proxy=new Proxy(real);//把被代理人传给代理
        System.out.println("*****代理*****");
        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.fromTo();

        System.out.println("\n*****真人*****");
        real.confer();
        real.signContract();
        real.bookTicket();
        real.sing();
        real.fromTo();
    }
}
