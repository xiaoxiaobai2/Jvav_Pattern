package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察的主题对象
 */
public class Subject {
    //存储所有的观察者
    private List<Observer> list=new ArrayList<Observer>();

    public void registerObserver(Observer o){
        list.add(o);
    }

    public void removeObserver(Observer o){
        list.remove(o);
    }

    //通知所有的观察者状态发生了改变
    public void notifyAllObserver(){
        for (Observer o:
             list) {
            o.update(this);
        }
    }

}
