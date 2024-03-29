package Factory.AbstractFactory;

public interface CarFactory {
    Engine createEngine();
    Tyre createTyre();
    Seat createSeat();
}
