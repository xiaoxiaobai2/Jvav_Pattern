package Singleton;

/**
 * @author 张浩
 * @Date 2019.09.18
 * 单例设计模式
 *         -饿汉式
 */
public class SingletonDemo01 {
    private static SingletonDemo01 singletonDemo01=new SingletonDemo01();//类初始化时立即加载

    private SingletonDemo01() {
    }

    public static SingletonDemo01 getInstance(){
        return singletonDemo01;
    }
}
