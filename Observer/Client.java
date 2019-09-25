package Observer;

/**
 * 测试观察者模式
 * @author 张浩
 * @date 2019.09.25
 */
public class Client {
    public static void main(String[] args) {
        ObserverA observer1=new ObserverA();
        ObserverA observer2=new ObserverA();
        ObserverA observer3=new ObserverA();
        ObserverA observer4=new ObserverA();
        ConcreteSubject concreteSubject=new ConcreteSubject();
        concreteSubject.registerObserver(observer1);
        concreteSubject.registerObserver(observer2);
        concreteSubject.registerObserver(observer3);
        concreteSubject.registerObserver(observer4);
        concreteSubject.setState(100);
        System.out.println(observer1.getState());
        System.out.println(observer2.getState());
        System.out.println(observer3.getState());
        System.out.println(observer4.getState());
    }
}
