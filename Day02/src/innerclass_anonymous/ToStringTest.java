package innerclass_anonymous;

import java.util.Objects;

//Object中的toString方法
public class ToStringTest {
    public static void main(String[] args) {
        Student s=new Student("叶修",'男',18);
        Student s1=new Student("叶修",'男',18);
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        }
}
class Student{
    public Student() {
    }

    private String name;
    private char sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }

    /**自己定制比较规则
     *
     * @return
     */
/*@Override
public boolean equals(Object o){
    //判断o是否是学生类
    if(o instanceof Student) {
        //判断2个对象内容是否一致
        Student s = (Student) o;
       *//* if (this.name.equals(s.name) && this.age == s.age && this.sex == s.sex) {
            return true;
        } else {
            return false;
        }*//*
        return this.name.equals(s.name) && this.age == s.age && this.sex == s.sex;
    }else {
        return  false;
    }
}*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
