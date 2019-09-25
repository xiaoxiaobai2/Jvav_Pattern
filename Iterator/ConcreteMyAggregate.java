package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建存储对象的列表
 * 生成一个迭代器内部类
 *      构建一个获取迭代器的方法
 */
public class ConcreteMyAggregate {
    private List list=new ArrayList();

    public void addObject(Object o){
        list.add(o);
    }

    public void removeObject(Object o){
        list.remove(o);
    }

    public List getList() {
        return list;
    }

    public MyIterator getIterator(){
        return new ConcreteIterator();
    }

    public void setList(List list) {
        this.list = list;
    }

    private class ConcreteIterator implements MyIterator{
        private int cusor=-1;

        @Override
        public void next() {
            cusor++;
        }

        @Override
        public boolean hasNext() {
            return cusor<list.size()-1?true:false;
        }

        @Override
        public Object first() {
            return list.get(0);
        }

        @Override
        public boolean isFirst() {
            return cusor==0?true:false;
        }

        @Override
        public boolean isLast() {
            return cusor==list.size()-1?true:false;
        }

        @Override
        public Object getCurrentObject() {
            return list.get(cusor);
        }
    }
}
