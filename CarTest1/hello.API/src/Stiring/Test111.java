package Stiring;

import java.util.Scanner;

public class Test111 {
    public static void main(String[] args) {
    //键盘录入手机号
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的手机号");
        String tel=scanner.next();
        String before = tel.substring(0,3);
        String end=tel.substring(7);
        String s=before+"****"+end;
        System.out.println("手机屏蔽后为："+s);
    }
}
