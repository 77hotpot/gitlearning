package _interface;

public interface InterfaceDemo {
   //常量
    public static final String School_Name ="萌学园";
    //方法
    public abstract void run();
    public abstract void eat();
    default void sleep(){
    }

}
