package State;

public class FreeState implements State {

    @Override
    public void handle() {
        System.out.println("房间空闲");
    }
}
