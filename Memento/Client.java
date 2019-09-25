package Memento;

/**
 * 测试备忘录模式
 */
public class Client {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Emp emp=new Emp("张浩",18,10000);
        System.out.println("第一次打印："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
        careTaker.setEmpMemento(emp.Memento(emp));
        emp.setAge(24);
        emp.setSalary(100000);
        careTaker.setEmpMemento(emp.Memento(emp));
        System.out.println("第二次打印："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());

        emp.setSalary(66666666);
        careTaker.setEmpMemento(emp.Memento(emp));
        System.out.println("第三次打印："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());

        emp=emp.recoveryEmp(careTaker.getEmpMemento());
        System.out.println("第四次打印："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
        emp=emp.recoveryEmp(careTaker.getEmpMemento());
        System.out.println("第五次打印："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
        emp=emp.recoveryEmp(careTaker.getEmpMemento());
        System.out.println("第六次打印："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
        emp=emp.recoveryEmp(careTaker.getEmpMemento());
        System.out.println("第七次打印："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());

    }
}
