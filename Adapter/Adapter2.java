package Adapter;

/**
 * 组合的方式实现
 * @author 张浩
 * @date 2019.09.19
 */
public class Adapter2 implements Target{

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
