package Builder;

/**
 * 模拟客户端
 *  实例化生产者  -->生产
 *  实例化组装者  -->组装
 *  实例化飞船
 *  测试飞船
 * @author 张浩
 * @date 2019.09.18
 */
public class Client {
    public static void main(String[] args) {
        //实例化一个建造者
        AirShipBuilder builder=new ZhAirShipBuilder();
        System.out.println("*****builder开始建造各种零件。。。*****");
//        //建造各个零部件
//        builder.builderEngine();
//        builder.builderEscapeTower();
//        builder.builderOrbitModule();
        //实例化一个组装者
        AirShipDirector director=new ZhAirShipDirector(builder);
        //组装飞船
        System.out.println("\n*****director开始组装各种零件。。。*****");
        AirShip ship=director.directorAirship();//组装零件
        //测试飞船

        System.out.println("\n*****Client开始测试飞船。。。*****");
        System.out.println(ship.getEngine().getName());
        System.out.println(ship.getEscapeTower().getName());
        System.out.println(ship.getEscapeTower().getName());

        System.out.println("\n*****飞船起飞。。。*****");
        ship.lunch();
    }
}
