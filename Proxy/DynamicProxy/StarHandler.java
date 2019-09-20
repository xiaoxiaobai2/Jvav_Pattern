package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj=null;
        System.out.println("唱歌前。。。。");
        if (method.getName().equals("sing")){
            obj=realStar;
            method.invoke(realStar,args);
        }
        System.out.println("唱歌后。。。。");
        return obj;
    }
}
