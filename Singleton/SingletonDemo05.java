package Singleton;

import java.io.Serializable;

/**
 * 防止  反射和序列化  破解单例
 * @author 张浩
 * @Date 2019.09.18
 */
public class SingletonDemo05 implements Serializable {
    private static SingletonDemo05 singletonDemo02;

    //构造器私有化
    private SingletonDemo05() {
        //防止通过反射破解单例
        if (singletonDemo02!=null)
        {
            System.err.println("单例设计模式，严禁私自实例化！！！");
            throw new RuntimeException();
        }
    }

    //调用时才实例化，并且加入synchronized保证线程安全，确保只有一个实例化，调用效率低
    public synchronized static SingletonDemo05 getInstance(){
        //判空才实例化
        if (singletonDemo02==null){
            singletonDemo02=new SingletonDemo05();
        }
        return singletonDemo02;
    }

    private Object readResolve(){
        //防止反序列化构建新的实例
        return singletonDemo02;
    }
}
