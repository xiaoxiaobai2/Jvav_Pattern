package State;

/**
 * 上下文，设置当前的状态
 */
public class RoomContext {
    private State state;

    public void setState(State state) {
        System.out.println("修改状态。。。");
        this.state = state;
        state.handle();
    }

    public State getState() {
        return state;
    }
}
