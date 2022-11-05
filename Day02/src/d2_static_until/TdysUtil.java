package d2_static_until;

import java.util.Random;

public class TdysUtil {

    private TdysUtil(){

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
