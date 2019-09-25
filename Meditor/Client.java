package Meditor;

/**
 * 测试中介模式
 *      解耦多个同事之间的关系
 *      由经理 完成协调工作 每个人只需要和经理打交道
 * @author 张浩
 * @date 2019.09.25
 */
public class Client {
    public static void main(String[] args) {
        Meditor m=new Director();//实例化一个中介（经理）
        Department finacial=new Finacial("财务部",m);
        Department development=new Development("研发部",m);
        Department market=new Market("市场部",m);
        System.out.println("市场部。。。。。。。。。。。。。。");
        finacial.selfAction();
        finacial.outAction();

        System.out.println("研发部。。。。。。。。。。。。。。");
        development.selfAction();
        development.outAction();


    }
}
