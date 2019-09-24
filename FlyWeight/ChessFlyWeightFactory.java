package FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class ChessFlyWeightFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map=new HashMap<>();
    public static ChessFlyWeight getChesss(String color){
        if (!map.containsKey(color)){
            map.put(color,new ConcreteFlyWeight(color));
            return map.get(color);
        }
        else return map.get(color);
    }
}
