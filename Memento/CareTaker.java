package Memento;

import java.util.Stack;

/**
 * 备忘录管理者
 */
public class CareTaker {
    private EmpMemento empMemento;
    //存储备份信息
    private Stack<EmpMemento> empMementos=new Stack<>();

    public EmpMemento getEmpMemento() {
        if (empMementos.size()==1){
            return empMementos.peek();//如果为最后一个元素，则只读
        }else return empMementos.pop();
    }

    public void setEmpMemento(EmpMemento empMemento) {
        empMementos.push(empMemento);
    }
}
