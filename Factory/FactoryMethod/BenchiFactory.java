package Factory.FactoryMethod;

public class BenchiFactory implements CarFactory {
    @Override
    public Car creatCar() {
        return new Benchi();
    }
}

