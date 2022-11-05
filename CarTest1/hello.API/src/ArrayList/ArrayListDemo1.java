package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList list =new ArrayList();
       //添加
        list.add("java");
        list.add("wow");
        list.add("mysql");
        list.add("中");
        System.out.println(list);
        list.add(1, "叶修");
        System.out.println(list);
    }
}
