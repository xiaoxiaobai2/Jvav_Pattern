package Proxy.StaticProxy;

public class Proxy implements Star {
    //被代理的明星
    private Star star;

    public Proxy(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("代理面谈");
    }

    @Override
    public void signContract() {
        System.out.println("代理签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("代理订票");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void fromTo() {
        System.out.println("代理接送");
    }
}
