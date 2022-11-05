package CarTest;

public class Test1 {
    public static void main(String[] args) {
        //创建汽车对象
        Car c= new Car();
        c.name="宝马";
        c.price=38.9;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();
        Student student1=new Student();
        student1.sex="男";
        student1.name="叶修";
        student1.id=512021520;
        student1.name();
        student1.id();
        student1.sex();
        Student student2=new Student();
        student1.sex="女";
        student1.name="田登宇";
        student1.id=512520;
        student1.name();
        student1.id();
        student1.sex();
    }
}
