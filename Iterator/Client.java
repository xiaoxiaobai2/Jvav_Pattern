package Iterator;

/**
 * 迭代器模式
 * @author 张浩
 * @date 2019.09.25
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate concreteMyAggregate=new ConcreteMyAggregate();
        concreteMyAggregate.addObject("aa");
        concreteMyAggregate.addObject("bb");
        concreteMyAggregate.addObject("cc");
        concreteMyAggregate.addObject("dd");
        MyIterator iterator=concreteMyAggregate.getIterator();
        while (iterator.hasNext()){
            iterator.next();
            System.out.println(iterator.getCurrentObject());
        }
    }
}
