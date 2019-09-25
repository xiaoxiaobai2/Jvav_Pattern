package Observer2;

import java.util.Observable;
import java.util.Observer;

public class ConcreteSubject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }
}
