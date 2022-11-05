package com.tdy.hello;

import java.util.Random;
import java.util.Scanner;

public class RandomUse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random cs = new Random();
            int cai=sc.nextInt();
            int num=cs.nextInt(10)+1;
            if(num==cai){
                System.out.println("恭喜你猜对啦！");
            }
            else System.out.println("抱歉，猜错了哦，下次努力！");
    }
}
