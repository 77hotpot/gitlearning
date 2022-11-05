package api_lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo1 {
    public static void main(String[] args) throws ParseException {
        //创建一个date类对象，
      /*  long time = System.currentTimeMillis();
        time +=(60*60+121)*1000;*/
       /* Date d=new Date(time);
        System.out.println(d);*/
      /*  Date d=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss EEE a");
        String rs=simpleDateFormat.format(d);
        System.out.println(rs);*/
        SimpleDateFormat sdf=new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss");
        String wo="2021年08月06日 11:11:11";
       Date d= sdf.parse(wo);
       long time =d.getTime()+(2L*24*60*60+14*60*60+6)*1000;
        String d1=sdf.format(time);
        System.out.println(d1);
    }
}
