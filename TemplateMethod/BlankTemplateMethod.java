package TemplateMethod;

/**
 * 抽象类
 *         抽象方法处理不同的事物，调用时子类重写
 *       模板方法，不可重写
 */
public abstract class BlankTemplateMethod {
    public void getNumber(){
        System.out.println("取号。");
    }

    //抽象方法，不同的子类去重写他
    public abstract void transact();

    public void appraise(){
        System.out.println("评价打分");
    }

    //模板   不允许子类重写
    public final void process(){
        getNumber();
        transact();
        appraise();
    }
}
