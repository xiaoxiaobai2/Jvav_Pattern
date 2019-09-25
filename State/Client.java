package State;

/**
 * 测试状态模式
 * @author 张浩
 * @date 2019.09.25
 */
public class Client {
    public static void main(String[] args) {
        RoomContext roomContext=new RoomContext();
        roomContext.setState(new FreeState());
    }
}
