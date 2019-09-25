package Iterator;

/**
 * 迭代器接口
 */
public interface MyIterator {
    void next();
    boolean hasNext();
    Object first();
    boolean isFirst();
    boolean isLast();
    Object getCurrentObject();
}
