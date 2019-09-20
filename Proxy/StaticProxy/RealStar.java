package Proxy.StaticProxy;


public class RealStar implements Star {
    private String name;

    public RealStar(String name) {
        this.name=name;
    }

    @Override
    public void confer() {
        System.out.println("真人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("真人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("真人订票");
    }

    @Override
    public void sing() {
        System.out.println("真人唱歌：" + name+"！");
    }

    @Override
    public void fromTo() {
        System.out.println("真人接送");
    }
}
