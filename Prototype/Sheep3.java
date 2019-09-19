package Prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep3 implements Cloneable, Serializable {
    private String name;
    private Date birthday;

    public Sheep3() {
    }

    public Sheep3(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();
        return obj;
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
