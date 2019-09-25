package Strategy;

/**
 * 上下文   客户端和策略彻底的分离
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void printPrice(double price){
        System.out.println("报价："+strategy.getPrice(price));
    }
}
