package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> allStudents =new ArrayList<>();
        allStudents.add(new Student("2021001","叶修",23,"一年级一班"));
        allStudents.add(new Student("2021001","叶修",23,"一年级一班"));
        allStudents.add(new Student("2021001","叶修",23,"一年级一班"));
        allStudents.add(new Student("2021001","叶修",23,"一年级一班"));
        for (int i = 0; i < allStudents.size(); i++) {
            Student s = allStudents.get(i);
            System.out.println(s.getName() + "\t" + s.getStudyNumber() + "\t" + s.getClassName() + "\t" + s.getAge());
        }Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("请输入查询的学号");
            String stuNumber=scanner.next();
            Student s=getStudentById(allStudents,stuNumber);
            if(s==null){
                System.out.println("抱歉查无此人！");
            }
            else{
                System.out.println("您查询的学生信息如下：");
                System.out.println(s.getName() + "\t" + s.getStudyNumber() + "\t" + s.getClassName() + "\t" + s.getAge());

            }
        }
    }

    //定义方法搜
        public  static  Student getStudentById(ArrayList<Student> students,String stuNumber) {
            //
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                if (s.getStudyNumber().equals(stuNumber)) {
                    return s;
                }

            }
            return null;
        }
}
