package Singleton;

/**
 * 测试4种单例模式
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("******饿汉式单例测试******");
        SingletonDemo01 singletonDemo01=SingletonDemo01.getInstance();
        SingletonDemo01 singletonDemo02=SingletonDemo01.getInstance();
        System.out.println(singletonDemo01);
        System.out.println(singletonDemo02);

        System.out.println("******懒汉式单例测试******");
        SingletonDemo02 singletonDemo03=SingletonDemo02.getInstance();
        SingletonDemo02 singletonDemo04=SingletonDemo02.getInstance();
        System.out.println(singletonDemo03);
        System.out.println(singletonDemo04);

        System.out.println("******静态内部类单例测试******");
        SingletonDemo03 singletonDemo05=SingletonDemo03.getInstance();
        SingletonDemo03 singletonDemo06=SingletonDemo03.getInstance();
        System.out.println(singletonDemo05);
        System.out.println(singletonDemo06);

        System.out.println("******枚举单例测试******");
        SingletonDemo04 singletonDemo07=SingletonDemo04.SINGLETON_DEMO_04;
        SingletonDemo04 singletonDemo08=SingletonDemo04.SINGLETON_DEMO_04;
        System.out.println(singletonDemo07);
        System.out.println(singletonDemo08);
    }
}
