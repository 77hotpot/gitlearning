package api_lambda;

import _interface.Law;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {
    public static void main(String[] args) {
       /* Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        int year=cal.get(Calendar.YEAR);
        cal.set(Calendar.YEAR,2021);
        cal.add(Calendar.YEAR,64);
        System.out.println(cal.getWeekYear());*/
      /*  LocalDate nowDate=LocalDate.now();
        System.out.println("今天的日期是："+nowDate);
        int year=nowDate.getYear();
        System.out.println("今年是："+year);

        int dayOfYear=nowDate.getDayOfYear();
        System.out.println("dayOdfYear:"+dayOfYear);*/
        /*Instant instant=Instant.now();
        System.out.println(instant);
        System.out.println(instant.atZone(ZoneId.systemDefault()));
        System.out.println("------------------");
        Integer i=23;
        String o=i.toString();
        System.out.println(o+1);
        String rs="1456";
        Integer oo=Integer.parseInt(rs);
        System.out.println(oo);*/
        Scanner sc= new Scanner(System.in);
        String ss=sc.next();
        System.out.println(ss.matches("\\W"));
        System.out.println(ss.matches("\\w{6,}"));
        System.out.println(ss.matches("[a-zA-Z0-9&&[^_]]{4}"));
        System.out.println(ss.matches("[\\w&&[^_]]{4}"));


    }
}
