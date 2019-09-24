package Bridge;

/**
 * 品牌类（品牌维度）
 */
public interface Brand {
    void sale();
}

class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}

class Huashuo implements Brand{
    @Override
    public void sale() {
        System.out.println("销售华硕电脑");
    }
}

class Dale implements Brand{
    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}