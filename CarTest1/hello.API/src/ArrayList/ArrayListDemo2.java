package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList();
        list.add(98);
        list.add(89);
        list.add(77);
        list.add(66);
        list.add(79);
        list.add(50);
        list.add(100);
        System.out.println(list);
     /*   for (int i = 0; i < list.size(); i++) {
            int scores=list.get(i);
            if(scores<80){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);*/
        for (int i = list.size()-1; i >=0; i--) {
            int scores = list.get(i);
            if (scores < 80) {
                list.remove(i);
            }
        }
        System.out.println(list);
        }
}
