package api_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //学会使用Lambda的标准格式，简化匿名内部类的代码是形式
        Animal a = new Animal() {

            @Override
            public void run() {
                System.out.println("乌龟爬得慢");
            }
        };
        go(a);
        go(new Animal() {

            @Override
            public void run() {
                System.out.println("乌龟爬得慢");
            }
        });

      /*  Animal a1 = () -> {
            System.out.println("乌龟爬得慢");
        };
        go(a1);
    }*/

   /* go(() ->{
        System.out.println("乌龟爬得慢");
    });*/
        Animal a1 = () -> {
            System.out.println("乌龟跑的慢慢");
        };
        go(a1);
        go(() -> {
            System.out.println("乌龟跑的慢慢");
        });
    }
    public static void go(Animal animal){
        System.out.println("开始~~~··");
        animal.run();
        System.out.println("结束~~~");
    }
}
@FunctionalInterface
interface Animal{

    public abstract  void run();
}