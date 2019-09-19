package Prototype;

import java.io.*;
import java.util.Date;

/**
 * 深克隆模型
 *        java 对象在作为参数传递时，传递的时引用的备份，所以两者只想同一个地址
 *              当原资源改变时，clone的也会改变
 *
 *              解决办法二 --- 通过序列化和反序列化
 * @author 张浩
 * @date 2019.09.19
 */
public class Test03 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date date=new Date(10000000000000000L);
        Sheep3 sheep1=new Sheep3("多利",date);

        System.out.println("母体原始信息：");
        System.out.println(sheep1);
        System.out.println(sheep1.getName());
        System.out.println(sheep1.getBirthday());

        //序列化和反序列化 获取对象的副本
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(baos);
        oos.writeObject(sheep1);//克隆，序列化
        oos.flush();
        byte[] bytes=baos.toByteArray();
        baos.flush();
        baos.close();
        oos.close();
        ByteArrayInputStream bais=new ByteArrayInputStream(bytes);
        ObjectInputStream ois=new ObjectInputStream(bais);
        Sheep3 sheep2=(Sheep3) ois.readObject();//克隆对象
        ois.close();
        bais.close();


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
