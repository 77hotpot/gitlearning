package polymorphic;

public class Dog extends Animal {
    @Override
    void run() {
        System.out.println("狗狗跑的快");
    }
    public void LookDoor(){
        System.out.println("在看门");
    }
    public String name ="子类狗";
}
