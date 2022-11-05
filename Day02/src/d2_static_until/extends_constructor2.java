package d2_static_until;

public class extends_constructor2 {
    public static void main(String[] args) {
    teacher teacher=new teacher("叶修",18);
    //teacher.setAge(18);
    //teacher.setName("叶修");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
    }
}

class People{
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class teacher extends People{
    public teacher(String name, int age) {
        super(name, age);
    }
}