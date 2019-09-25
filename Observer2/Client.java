package Observer2;

import Observer.Observer;

public class Client {
    public static void main(String[] args) {
        ObserverA observer1=new ObserverA();
        ObserverA observer2=new ObserverA();
        ObserverA observer3=new ObserverA();
        ConcreteSubject concreteSubject=new ConcreteSubject();
        concreteSubject.addObserver(observer1);
        concreteSubject.addObserver(observer2);
        concreteSubject.addObserver(observer3);
        concreteSubject.setState(100);
        System.out.println(observer1.getState());
        System.out.println(observer2.getState());
        System.out.println(observer3.getState());
    }
}
