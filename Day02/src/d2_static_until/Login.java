package d2_static_until;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        System.out.println("请输入您想生成的验证码位数：");
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();

        System.out.println("验证码是："+TdysUtil.creatCode(N));
    }
}
