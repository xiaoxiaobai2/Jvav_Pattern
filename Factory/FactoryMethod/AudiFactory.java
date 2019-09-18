package Factory.FactoryMethod;

public class AudiFactory implements CarFactory {
    @Override
    public Car creatCar() {
        return new Audi();
    }
}
