package Factory.AbstractFactory;

public interface Tyre {
    void rev();//转速
}
class LuxuryTyre implements Tyre{

    @Override
    public void rev() {
        System.out.println("转速高！");
    }
}
class GeneralTyre implements Tyre{

    @Override
    public void rev() {
        System.out.println("转速慢！");
    }
}