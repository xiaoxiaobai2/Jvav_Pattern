package Builder;

/**
 * 实现一个特定的生产者  实现各种生产方法
 * @author 张浩
 * @date 2019.09.18
 */
public class ZhAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("正在建造张浩牌发动机");
        return new Engine("张浩牌发动机");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("正在建造张浩牌逃逸塔");
        return new EscapeTower("张浩牌逃逸塔");
    }

    @Override
    public OrbitModule builderOrbitModule() {
        System.out.println("正在建造张浩牌轨道舱");
        return new OrbitModule("张浩牌轨道舱");
    }
}
