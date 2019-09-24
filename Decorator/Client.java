package Decorator;

public class Client {
    public static void main(String[] args) {
        ICar car=new Car();
        car.move();

        //添加超级功能
        System.out.println("添加超级功能----天上飞");
        FlyCar flyCar=new FlyCar(car);
        flyCar.move();

        //组合超级功能
        System.out.println("添加组合超级功能----天上飞，水里游，自动跑");
        //类似于io留  就是装饰模式
        AICar superCar=new AICar(new WaterCar(new FlyCar(car)));
        superCar.move();
    }
}
