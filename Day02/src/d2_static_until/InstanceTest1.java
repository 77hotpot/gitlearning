package d2_static_until;

public class InstanceTest1 {
    public static void main(String[] args) {
        SingleInstance1 s1=SingleInstance1.instance1;
        SingleInstance1 s2=SingleInstance1.instance1;
        System.out.println(s1 == s2);
    }
}
