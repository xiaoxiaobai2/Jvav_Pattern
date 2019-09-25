package TemplateMethod;

/**\
 * 测试模板方法模式
 * @author 张浩
 * @date 2019.09.25
 */
public class Client {
    public static void main(String[] args) {
        //匿名内部类
        BlankTemplateMethod blankTemplateMethod=new BlankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("取1个亿！");
            }
        };
        blankTemplateMethod.process();
    }
}
