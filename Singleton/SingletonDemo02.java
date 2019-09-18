package Singleton;

/**
 * 单例设计模式
 *        -- 懒汉式(延时加载，真正用时才加载，)
 * @author 张浩
 * @Date 2019.09.18
 */
public class SingletonDemo02 {
    private static SingletonDemo02 singletonDemo02;

    //构造器私有化
    private SingletonDemo02() {
    }

    //调用时才实例化，并且加入synchronized保证线程安全，确保只有一个实例化，调用效率低
    public synchronized static SingletonDemo02 getInstance(){
        //判空才实例化
        if (singletonDemo02==null){
            singletonDemo02=new SingletonDemo02();
        }
        return singletonDemo02;
    }
}
