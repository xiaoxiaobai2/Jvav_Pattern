package Meditor;

import java.util.HashMap;
import java.util.Map;

public class Director implements Meditor {
    //存储 错有的部门  通过部门的名字获取到部门对象
    private Map<String,Department> map=new HashMap<String,Department>();
    //给某部下达命令
    @Override
    public void command(String dName) {
        //获取部门 名 并下达命令
        map.get(dName).selfAction();
    }

    //添加部门
    @Override
    public void register(String dName,Department department) {
        //供 其他部门注册使用
        map.put(dName,department);
    }
}
