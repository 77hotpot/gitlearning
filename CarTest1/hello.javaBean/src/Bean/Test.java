package Bean;

import Film.Movie;

public class Test {
    public static void main(String[] args) {
    User u1=new User();
    u1.setName("吴彦祖");
    u1.setHeight(180.5);
    u1.setSalary(1000.0);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());
    User u2=new User("叶修",188,8800);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());

    }
}
