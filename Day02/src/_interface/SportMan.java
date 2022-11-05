package _interface;

public interface SportMan extends Law {
        void run();
        void competition();
        default void test1(){
                System.out.println("接口默认方法");

        }
        static void wow(){
                System.out.println("接口静态方法");

        }

}
