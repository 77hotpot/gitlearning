package polymorphic;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.run();
        Dog p = (Dog) a;
        p.LookDoor();
        Animal b = new Tortoise();
        b.run();
        if (b instanceof Tortoise) {
            Tortoise t = (Tortoise) b;
            t.egg();
        }
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.LookDoor();
        }
    }

/*    public static void go(Animal animal){
        System.out.println("开始比赛");
        animal.run();
        System.out.println("结束");
    }*/
}
