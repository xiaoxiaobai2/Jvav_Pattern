package Proxy.StaticProxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @author 张浩
 * @date 2019.09.20
 */
public class Client {
    public static void main(String[] args) {
        Star real=new RealStar("周杰伦");
        StarHandler handler=new StarHandler(real);
        Star proxy=(Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);
        proxy.sing();
    }
}
