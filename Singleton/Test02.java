package Singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * 利用反射和反序列化破解单例模式
 * @author 张浩
 * @Date 2019.09.18
 */
public class Test02{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        SingletonDemo05 instance1=SingletonDemo05.getInstance();
        SingletonDemo05 instance2=SingletonDemo05.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

//        System.out.println("*****通过反射直接调用私有构造器*****");
//        Class clazz=Class.forName("Singleton.SingletonDemo05");
//        Constructor<SingletonDemo05> c=clazz.getDeclaredConstructor(null);
//        c.setAccessible(true);
//        SingletonDemo05 instance3=c.newInstance();
//        SingletonDemo05 instance4=c.newInstance();
//
//        System.out.println(instance3);
//        System.out.println(instance4);

        System.out.println("*******通过反序列化构造多个对象**********");
        FileOutputStream fos=new FileOutputStream("a.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(instance1);
        oos.flush();
        oos.close();
        fos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
        SingletonDemo05 obj=(SingletonDemo05)ois.readObject();
        System.out.println(obj);
    }
}
