package Decorator;

public interface ICar {
    void move();
}

/**
 * 普通车
 */
class Car implements ICar{

    @Override
    public void move() {
        System.out.println("路上跑！");
    }
}

/**
 * 超级车
 */
class SuperCar implements ICar{
    private ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}