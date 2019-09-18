package Factory.AbstractFactory;

/**
 * 测试抽象工厂模式
 *      可以增加产品族，不可以增加单个产品
 */
public class Test {
    public static void main(String[] args) {
        LuxuryCarCreate luxuryCar =new LuxuryCarCreate();

        Engine engine=luxuryCar.createEngine();
        Seat seat=luxuryCar.createSeat();
        Tyre tyre=luxuryCar.createTyre();

        engine.run();
        engine.start();
        seat.pijv();
        tyre.rev();
    }
}
