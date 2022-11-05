package api_lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {
        String startTime="2022-07-01 00:00:00";
        String endTime="2022-07-01 00:10:00";
        String xiaojia="2022-07-01 00:03:32";
        String xiaopi="2022-07-01 00:11:45";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        Date d1 =sdf1.parse(startTime);
        Date d2 =sdf1.parse(endTime);
        Date d3 =sdf1.parse(xiaojia);
        Date d4 =sdf1.parse(xiaopi);
        if (d3.after(d1)&&d3.before(d2)){
            System.out.println("小贾抢购成功");
        }else{
            System.out.println("小贾抢购失败");
        }
        if (d4.after(d1)&&d4.before(d2)){
            System.out.println("小皮抢购成功");
        }else{
            System.out.println("小皮抢购失败");
        }

    }
}
