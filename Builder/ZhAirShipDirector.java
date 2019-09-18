package Builder;

/**
 * 实现一个特定的组装者 实现组装飞船的方法
 */
public class ZhAirShipDirector implements AirShipDirector{
    private AirShipBuilder builder;

    public ZhAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    public AirShipBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirship() {
        AirShip ship=new AirShip();
        ship.setEngine(builder.builderEngine());
        ship.setEscapeTower(builder.builderEscapeTower());
        ship.setOrbitModule(builder.builderOrbitModule());
        return ship;
    }
}
