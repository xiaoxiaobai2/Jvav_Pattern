package FlyWeight;


public interface ChessFlyWeight {
    void setColor();
    String getColor();
    void display(Coordinate c);
}


/**
 * 享元共享的状态
 */
class ConcreteFlyWeight implements ChessFlyWeight{

    private String color;

    public ConcreteFlyWeight(String color) {
        this.color = color;
    }

    @Override
    public void setColor() {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    /**
     * 传递不共享的状态
     * @param c
     */
    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置:  ("+c.getX()+","+c.getY()+")");
    }
}