package innerclass_anonymous;

public class Test {
    public static void main(String[] args) {

        Animal a=new Animal() {
            @Override
            public void run() {
                System.out.println("鼠鼠过街~~~");
            }
        };
        a.run();
    }
}
/*class  Tiger extends Animal{

    @Override
    public void run() {
        System.out.println("老虎跑得快");

    }
}*/
abstract class Animal {
    public abstract void run();

}