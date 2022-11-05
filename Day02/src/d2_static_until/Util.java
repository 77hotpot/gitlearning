package d2_static_until;

import java.util.Random;
import java.util.Scanner;

//验证码方法
public class Util {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        code(N);
    }
        public static void code(int n) {

            String code = creatCode(n);
            System.out.println("随机生成的验证码是：" + code);
        }
        //随机生成验证码
        public static String creatCode(int n){
            String code="";
            Random r= new Random();
            for(int i=0;i<n;i++){
                int type=r.nextInt(3);
                switch (type) {
                    case 0:
                        //大写字母A65-B65+25
                        char ch = (char) (r.nextInt(26) + 65);
                        code += ch;
                        break;
                    case 1:
                        //小写字母
                        char ch1 = (char) (r.nextInt(26) + 97);
                        code += ch1;
                        break;
                    case 2:
                        //数字
                        code += r.nextInt(10);
                        break;

                }
            }
            return code;
        }
    }


