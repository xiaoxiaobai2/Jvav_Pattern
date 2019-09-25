package Meditor;

/**
 * 市场部
 */
public class Market implements Department {
    private Meditor meditor;
    private String dName;

    public Market(String dName,Meditor meditor) {
        this.meditor = meditor;
        this.dName = dName;
        //在 中介处 添加市场部
        meditor.register(dName,this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作：正在拉赞助，需要钱打广告！");
        meditor.command("财务部");
    }

    @Override
    public void selfAction() {
        System.out.println("拉赞助。");
    }
}

