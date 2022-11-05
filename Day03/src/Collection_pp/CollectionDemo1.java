package Collection_pp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //有序 可重复 有索引
        Collection list=new ArrayList();
        list.add("java");
        list.add("mysql");
        list.add("Mybatis");
        list.add("Mybatis");
        list.add(18);
        list.add(23);
        list.add(false);
        System.out.println(list);
        //无序 不重复 无索引
        Collection list1=new HashSet();
        list1.add("java");
        list1.add("mysql");
        list1.add("Mybatis");
        list1.add("Mybatis");
        list1.add(18);
        list1.add(23);
        list1.add(false);
        System.out.println(list1);
        System.out.println("==============================");
        Collection list2=new ArrayList();
        list2.add("java");
        list2.add("java");
        list2.add("java");
        list2.add(45);
       //清空
    /*    list.clear();
        System.out.println(list);*/
        //集合是否为空
        System.out.println(list.isEmpty());
        System.out.println(list.contains(18));
        list.remove(18);
        System.out.println("+++++++++");
        System.out.println(list);
        Collection <String > l=new ArrayList();
        l.add("java");
        l.add("mysql");
        l.add("jdbc");
        Object[] arr=l.toArray();
        //把集合转成数组
        System.out.println("数组："+Arrays.toString(arr));
    }
}
