package ChainOfRequest;

/**
 * 责任链模式  测试
 *      添加新的 责任链成员时不需要改变其他的
 *              关键  设置 setNextLeader
 * @author 张浩
 * @date 2019.09.25
 */
public class Client {
    public static void main(String[] args) {
        Leader director=new Director("张三");
        Leader manger=new Manger("李四");
        Leader generalManger=new GeneralManger("张浩");
        director.setNextLeader(manger);
        manger.setNextLeader(generalManger);

        LeaveRequest req=new LeaveRequest("小高",10,"回家娶媳妇儿");
        director.handRequest(req);
    }
}
