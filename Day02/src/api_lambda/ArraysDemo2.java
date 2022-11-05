package api_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        int []ages={34,12,42,23};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
   //
        Integer []ages1={34,12,42,23};
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*if(o1>o2){
                    return 1;
                }else if (o1<o2){
                    return -1;
                }
                return 0;*/
                if (o1<o2){
                    return 1;
                }else if(o1>o2){
                    return -1;
                }
                return 0;
            }
    });
        System.out.println(Arrays.toString(ages1));

        System.out.println("===============");
        Student[] students=new Student[3];
        students[0]=new Student("叶修",28,181);
        students[1]=new Student("吴磊",19,185.5);
        students[2]=new Student("张三",21,180);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getAge()-o2.getAge();
//                return o2.getAge()-o1.getAge();
                return Double.compare(o2.getAge(),o1.getAge());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
