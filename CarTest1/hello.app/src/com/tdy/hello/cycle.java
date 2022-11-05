package com.tdy.hello;

import java.util.Scanner;

public class cycle {
    public static void main(String[] args) {
        //定义死循环
        /*for(;;){
            System.out.println("hello hello!");
        }*/
       /* while (true){
            System.out.println("hello");
        }*/
        Scanner wow =new Scanner(System.in);
        System.out.println("----------");
        int okPassdId=520;
        while (true){
            System.out.println("请输入您的密码");
           int PassdId = wow.nextInt();
           if(okPassdId==PassdId){
               System.out.println("登录成功");
               break;
           }
           else System.out.println("密码错误！\n");
        }
    }
}
