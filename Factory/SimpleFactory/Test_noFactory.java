package Factory.SimpleFactory;

/**
 * 没有添加工厂模式
 */
public class Test_noFactory {
    public static void main(String[] args) {
        Car audi=new Audi();
        Car benchi=new Benchi();
        audi.run();
        benchi.run();
    }
}
