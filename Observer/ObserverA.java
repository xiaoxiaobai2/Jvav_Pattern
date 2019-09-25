package Observer;

/**
 * 具体的观察者
 */
public class ObserverA implements Observer {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    //更新自己的状态
    @Override
    public void update(Subject subject) {
        state=((ConcreteSubject)subject).getState();
    }
}
