package Stiring;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String okName="叶修";
        String okPassword="123456";
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入登录名称：");
        String name=scanner.next();
        System.out.println("登陆密码");
        String password=scanner.next();

        if(okName.equals(name)&&okPassword.equals(password)){
            System.out.println("登陆成功！");
        }
        else{
            System.out.println("用户名或者密码出错了");
        }
        String sysCode="23Adfh";
        String code="23aDFh";
        System.out.println(sysCode.equalsIgnoreCase(code));


    }
}
