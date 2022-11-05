package Collection_pp;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("java1");
        list.add("java2");
        list.add("java3");
        List list1=new ArrayList();
        list1.add("java1");
        list1.add(2.3);
        list1.add(false);
        list1.add("java4");
        for (Object o : list1) {
            String s=(String) o;
            System.out.println(s);
        }
    }
}
