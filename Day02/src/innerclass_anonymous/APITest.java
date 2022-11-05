package innerclass_anonymous;

public class APITest {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        System.out.println(sb);

        StringBuilder sb1= new StringBuilder();
        sb1.append("a").append("b").append("c").append("d");
        System.out.println(sb1);
        sb1.reverse().append("反转后");
        System.out.println(sb1);
        String rs=sb1.toString();
        check(String.valueOf(sb1));
        long time =System.currentTimeMillis();
        System.out.println("这是毫秒时间L:"+time);
    }
    public static void check(String data){
        System.out.println(data);
    }
}
