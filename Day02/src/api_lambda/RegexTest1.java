package api_lambda;

import java.util.Scanner;

public class RegexTest1 {
    public static void main(String[] args) {
        //校验 手机 邮箱
    checkYou();
    }
    public static void checkPhoneNumber(){
        while (true) {
            System.out.println("请您输入手机号：");
            Scanner scanner=new Scanner(System.in);
            String ph=scanner.next();
            boolean check=ph.matches("\\d{11,}");
            if(check){
                System.out.println("您的手机号正确");
            }else{
                System.out.println("您的手机号输入不正确");
            }
        }

    } public static void checkYou(){
        System.out.println("请您输入邮箱号：");
        Scanner scanner=new Scanner(System.in);
        String ph=scanner.next();
        boolean check=ph.matches("\\d{1,10}@[a-zA-Z0-9]{2,4}[.][a-zA-Z0-9]{2,4}");
        if(check){
            System.out.println("您的邮箱号正确");
        }else{
            System.out.println("您的邮箱号输入不正确");
        }

    }

}
