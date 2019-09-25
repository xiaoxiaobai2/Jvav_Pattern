package Observer;

/**
 * 具体的观察主题
 */
public class ConcreteSubject extends Subject {
    private int state;

    public int getState() {
        return state;
    }

    //当状态发生变化时，调用父类的通知方法
    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();
    }
}
