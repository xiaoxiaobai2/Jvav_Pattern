package Singleton;

/**
 * 静态内部类实现 也属于懒汉式
 *          优点：效率高，下城安全
 * @author 张浩
 * @Date 2019.09.18
 */
public class SingletonDemo03 {
    private static class SingletonInstance{
        private static SingletonDemo03 singletonDemo03=new SingletonDemo03();
    }
    //构造器私有化
    private SingletonDemo03() {
    }

    //获得类的实例
    public static SingletonDemo03 getInstance(){
        return SingletonInstance.singletonDemo03;
    }
}
