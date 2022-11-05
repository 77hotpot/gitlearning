package com.d1_static;

public class User {
    public static int onlineNumber=161;
    private String name;
    private int age;
    public static void main(String[] args) {
        System.out.println(User.onlineNumber);
        User u= new User();
        u.age=16;
        u.name="张三";
        u.onlineNumber++;
        System.out.println(u.onlineNumber);
    }

}
