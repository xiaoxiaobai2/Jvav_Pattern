package Factory.AbstractFactory;

public interface Engine {
    void run();
    void start();
}
class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑的快！");
    }

    @Override
    public void start() {
        System.out.println("启动快！");
    }
}
class GeneralEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑的慢！");
    }

    @Override
    public void start() {
        System.out.println("启动慢！");
    }
}

