package Prototype;

import java.util.Date;

/**
 * 深克隆模型
 *        java 对象在作为参数传递时，传递的时引用的备份，所以两者只想同一个地址
 *              当原资源改变时，clone的也会改变
 *
 *              所以在重写clone方法时  必须把属性也一并克隆一份
 * @author 张浩
 * @date 2019.09.19
 */
public class Test02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date=new Date(10000000000000000L);
        Sheep2 sheep1=new Sheep2("多利",date);

        System.out.println("母体原始信息：");
        System.out.println(sheep1);
        System.out.println(sheep1.getName());
        System.out.println(sheep1.getBirthday());

        Sheep2 sheep2=(Sheep2) sheep1.clone();
        sheep1.setName("??");
        date.setTime(10000l);
        sheep1.setBirthday(date);


        System.out.println("\n母体修改后信息：");
        System.out.println(sheep1);
        System.out.println(sheep1.getName());
        System.out.println(sheep1.getBirthday());

        System.out.println("\n克隆体的信息：");
        System.out.println(sheep2);
        System.out.println(sheep2.getName());
        System.out.println(sheep2.getBirthday());
    }
}
