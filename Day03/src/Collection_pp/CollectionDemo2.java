package Collection_pp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> lists=new ArrayList();
        lists.add("java");
        lists.add("mysql");
        lists.add("Mybatis");
        lists.add("Mybatis");
        System.out.println("============");
        lists.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        lists.forEach(s ->System.out.println(s));
        System.out.println("===================");
            for (String ele :lists){
                System.out.println(ele);
            }
            double [] scores={100,45,46,87};
        for (double score : scores) {
            System.out.println(score);
        }
     /*   System.out.println(list);
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String ele=it.next();
            System.out.println(ele);
        }*/

    }
}
