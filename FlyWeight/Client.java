package FlyWeight;

/**
 * 测试享元设计模式
 *      两个棋子的hashcode是同一个，节省内存
 *      之后非配不同的外部状态
 * @author 张浩
 * @date 2019.09.24
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1=ChessFlyWeightFactory.getChesss("黑色");
        ChessFlyWeight chess2=ChessFlyWeightFactory.getChesss("黑色");
        System.out.println(chess1);
        System.out.println(chess2);
        System.out.println("增加外部状态信息--------");
        chess1.display(new Coordinate(10,20));
        chess1.display(new Coordinate(50,60));
    }
}
