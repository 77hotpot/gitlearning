package d2_static_until;

public class StaticDemo222 {
    public StaticDemo222(){
        System.out.println("=====无参构造器来啦=====");
    }
    {
        System.out.println("=====实例代块被触发执行====");
    }

    public static void main(String[] args) {
    StaticDemo222 staticDemo222=new StaticDemo222();
    StaticDemo222 staticDemo333=new StaticDemo222();
    }
}
