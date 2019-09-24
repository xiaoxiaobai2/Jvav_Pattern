package Bridge;

/**
 * 桥接模式
 *   把每一种属性豆粉为一个类，用桥梁连接起来，添加一种属性时，不影响另外一种属性
 */
public class Client {
    public static void main(String[] args) {
        //联想笔记本电脑
        Laptop laptop=new Laptop(new Lenovo());
        laptop.sale();
    }
}
