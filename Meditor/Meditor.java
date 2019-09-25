package Meditor;

/**
 * 中介接口
 */
public interface Meditor {
    void command(String dName);
    void register(String dName,Department department);
}
