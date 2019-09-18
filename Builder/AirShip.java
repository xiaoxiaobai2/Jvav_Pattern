package Builder;

/**
 * 构建飞船，包括发动机、轨道舱、逃逸塔
 *      设置set/get方法
 * @author 张浩
 * @date 2018.09.18
 */
public class AirShip {
    private Engine engine;
    private EscapeTower escapeTower;
    private OrbitModule orbitModule;

    public AirShip() {
    }

    public void lunch(){
        System.out.println("发动机：" +engine.getName()+"已准备！");
        System.out.println("轨道舱：" +orbitModule.getName()+"已准备！");
        System.out.println("逃逸塔：" +escapeTower.getName()+"已准备！");
        System.out.println("一切准备就绪，飞船准备起飞！");
        System.out.println("倒计时十秒。");
        int time=10;
        while (time>0){
            System.err.println(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time--;
        }
        System.err.println("发射！！！");
}

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public OrbitModule getOrbitModule() {
        return orbitModule;
    }

    public void setOrbitModule(OrbitModule orbitModule) {
        this.orbitModule = orbitModule;
    }
}
class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapeTower {
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class OrbitModule {
    private String name;

    public OrbitModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
