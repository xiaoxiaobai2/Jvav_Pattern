package Facade;


/**
 * 门面类，把所有之前自己要办的事情交给她来办理
 *   最后只用调用他就可以了
 */
public class RegisterFacade {
    public void register(){
        System.out.println("起名字！");
        System.out.println("办理注册！");
        System.out.println("办卫生执照！");
        System.out.println("办营业执照！");
    }
}
