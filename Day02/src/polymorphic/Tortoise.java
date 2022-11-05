package polymorphic;

public class Tortoise extends Animal{

    @Override
    void run() {
        System.out.println("乌龟跑的慢慢");
    }
    public void egg(){
        System.out.println("在下蛋");
    }
}
