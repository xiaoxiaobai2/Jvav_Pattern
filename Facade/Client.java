package Facade;

/**
 * 测试外观设计模式
 *     让调用尽可能的方便简洁（迪米特法则--最少知识原则）
 * @author 张浩
 * @date 2019.09.24
 */
public class Client {
    public static void main(String[] args) {
        RegisterFacade registerFacade=new RegisterFacade();
        registerFacade.register();
    }
}
