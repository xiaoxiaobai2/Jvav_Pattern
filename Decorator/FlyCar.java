package Decorator;

public class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("天上飞");
    }
}

class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("水里游");
    }
}

class AICar extends SuperCar {
    public AICar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("自动跑");
    }
}