package innerclass_anonymous;
/*
目标：掌握匿名内部类的实用形式(语法）
* */
public class Test2 {
    public static void main(String[] args) {
    swimming s=new swimming() {
        @Override
        public void swim() {
            System.out.println("学生快乐的游泳~~~");
        }
    };
        go(s);
        System.out.println("=========");
        go(new swimming() {
            @Override
            public void swim() {
                System.out.println("学生快乐的游泳~~~");
            }
        });
/**
 * 学生、老师、运动员一起参赛
 * */
    }
    public static void go(swimming s){
        System.out.println("开始....");
        s.swim();
        System.out.println("结束。。。");
    }
}

interface swimming{
    void swim();
}