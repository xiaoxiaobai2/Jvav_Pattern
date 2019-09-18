package Factory.AbstractFactory;

public interface Seat {
    void pijv();
}
class LuxurySeat implements Seat{

    @Override
    public void pijv() {
        System.out.println("真皮座椅！");
    }
}
class GeneralSeat implements Seat{

    @Override
    public void pijv() {
        System.out.println("一般座椅！");
    }
}
