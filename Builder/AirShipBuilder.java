package Builder;

/**
 * 创建 构建者接口
 *        需要实现生产发动机、生产逃逸塔、生产轨道舱等方法
 * @author 张浩
 * @date 2019.09.18
 */
public interface AirShipBuilder {
    Engine builderEngine();//构建发动机
    EscapeTower builderEscapeTower();//构建逃逸塔
    OrbitModule builderOrbitModule();//构建轨道舱
}
