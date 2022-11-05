package d2_static_until;

public class extends_constructor {
    public static void main(String[] args) {
    dog dog1=new dog();

    }
}
class Animal{
        public Animal(){
            System.out.println("父类无参数构造器被执行");
        }
}
class dog extends Animal{
        public dog(){
            System.out.println("子类dog无参数构造器被执行~~~~~");
        }
}