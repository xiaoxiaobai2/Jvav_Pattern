package Factory.FactoryMethod;

/**
 * 测试工厂方法模式
 *      实现ocp模式  可扩展，关闭源码
 * @author 张浩
 * @date 2019.09.18
 */
public class FactoryMethod {
    public static void main(String[] args) {
        Car audi=new AudiFactory().creatCar();
        Car benchi=new AudiFactory().creatCar();
        audi.run();
        benchi.run();
    }
}
