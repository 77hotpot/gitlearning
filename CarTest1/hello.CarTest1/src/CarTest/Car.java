package CarTest;

public class Car {
    String name;
    double price;

    public void start() {
        System.out.println("启动了。");
    }

    public void run() {
        System.out.println("价格是：" + price+"的"+name+"跑得很快");
    }
}