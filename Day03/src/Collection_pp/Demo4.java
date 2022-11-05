package Collection_pp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<String > list=new ArrayList<>();
        list.add("阿尼亚");
        list.add("约尔");
        list.add("过家家");
        list.add("过家家");
        list.add("黄昏");
        list.add("间谍");
        list.add("杀手");

        System.out.println(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ele=it.next();
            if ("过家家".equals(ele)){
                //list.remove("过家家");
                it.remove();
            }
        }
        System.out.println(list);
       /* for (String s : list) {
            if ("过家家".equals(s)){
                it.remove();
            }
        }
        System.out.println(list);*/
      /*  list.forEach(s -> {
            if ("过家家".equals(s)){
                list.remove(s);
            }
        });
        System.out.println(list);*/

    }
}
