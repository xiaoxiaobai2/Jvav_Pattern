package Adapter;

/**
 * 继承的方式实现
 * @author 张浩
 * @date 2019.09.19
 */
public class Adapter extends Adaptee implements Target{

    public Adapter() {
    }

    @Override
    public void handleReq() {
        super.request();
    }
}
