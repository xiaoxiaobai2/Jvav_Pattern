package Prototype;

/**
 *  原型模型 测试实例化  和克隆 需要花费的时间
 * @author 张浩
 * @date 2019.09.19
 */
public class TestSpend {
    public static void main(String[] args) throws CloneNotSupportedException {
        Long start=System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            Temp t=new Temp();
        }
        long end=System.currentTimeMillis();
        System.out.println("通过构造器生产1000份花费时间"+(end-start)+"ms");
        start=System.currentTimeMillis();
        Temp t=new Temp();
        for (int i = 0; i <1000 ; i++) {
            Temp temp=(Temp) t.clone();
        }
        end=System.currentTimeMillis();
        System.out.println("通过克隆生产1000份花费时间"+(end-start)+"ms");
    }
}
class Temp implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Temp() {
        try {
            Thread.sleep(10);//模拟实例化需要花费的时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
