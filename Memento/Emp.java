package Memento;

/**
 * 雇员类
 *      设置  备忘和恢复方法
 */
public class Emp {
    private String name;
    private int age;
    private double salary;

    //备忘
    public EmpMemento Memento(Emp emp){
        return new EmpMemento(emp);
    }

    //恢复
    public Emp recoveryEmp(EmpMemento empMemento){
        this.age=empMemento.getAge();
        this.name=empMemento.getName();
        this.salary=empMemento.getSalary();
        return this;
    }

    public Emp() {
    }

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
