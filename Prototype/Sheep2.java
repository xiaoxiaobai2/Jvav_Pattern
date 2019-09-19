package Prototype;

import javax.xml.crypto.Data;
import java.util.Date;

public class Sheep2 implements Cloneable {
    private String name;
    private Date birthday;

    public Sheep2() {
    }

    public Sheep2(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();
        Sheep2 s=(Sheep2) obj;
        s.birthday = (Date)this.getBirthday().clone();//把birthday属性也复制一份
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
