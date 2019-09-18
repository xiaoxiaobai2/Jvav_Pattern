package Factory.AbstractFactory;

public class GeneralCarCreate implements CarFactory {


    @Override
    public Engine createEngine() {
        return new GeneralEngine();
    }

    @Override
    public Tyre createTyre() {
        return new GeneralTyre();
    }

    @Override
    public Seat createSeat() {
        return new GeneralSeat();
    }
}
