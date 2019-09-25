package Meditor;

/**
 * 财务部
 */
public class Finacial implements Department {
    private Meditor meditor;
    private String dName;

    public Finacial(String dName,Meditor meditor) {
        this.meditor = meditor;
        this.dName = dName;
        //在中介处   添加财务部
        meditor.register(dName,this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作：没钱了");
        meditor.command("市场部");
    }

    @Override
    public void selfAction() {
        System.out.println("数钱。");
    }
}
