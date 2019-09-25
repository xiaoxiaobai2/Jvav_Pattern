package Meditor;

/**
 * 研发部
 */
public class Development implements Department {
    private Meditor meditor;
    private String dName;

    public Development(String dName,Meditor meditor) {
        this.meditor = meditor;
        this.dName = dName;
        //在中介处  添加研发部
        meditor.register(dName,this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作：正在研发，需要研发资金！");
        meditor.command("财务部");
    }

    @Override
    public void selfAction() {
        System.out.println("研发");
    }
}
