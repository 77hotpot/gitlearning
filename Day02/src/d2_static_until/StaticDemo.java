package d2_static_until;

public class StaticDemo {
    static {
        System.out.println("~~~~~~~~静态代码被触发执行了~~~~~~");
    }

    public static void main(String[] args) {
        System.out.println("wow~~~~~~~");
    }
}
