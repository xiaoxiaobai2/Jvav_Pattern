package Factory.SimpleFactory;

/**
 * 测试简单工厂模式
 *   用的最多
 * @author 张浩
 * @date 2019.09.18
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Car audi=CarFactory.creatCar("奥迪");
        Car benchi=CarFactory.creatCar("奔驰");
        audi.run();
        benchi.run();
    }
}
