package tdy.test;


import java.util.Scanner;

 class Hero{
    //英雄名字
    private String name;
    //生命值
    public  int health;
    //等级
    private int grade;
    public Hero() {
        this.health=100;
        this.grade=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入英雄的名字：");
        this.name=scan.nextLine();
        print();

    }
    public Hero(int i) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入英雄的名字：");
        this.name=scan.nextLine();
        if(i==1) {
            System.out.println("普通英雄成功过创建：");
            this.health=100;
        }
        if(i==2) {
            System.out.println("高级英雄成功过创建：");
            this.health=200;
        }
        this.grade=1;
        print();
    }
    public void print() {
        System.out.println("Hero信息：");
        System.out.println("姓名："+this.name);
        System.out.println("生命值："+health);
        System.out.println("等级："+grade);
        System.out.println("----------------------------------------------------");
    }

    public void Fight(Hero h) {
        System.out.println("----------------------------------------------------");
        h.health-=100;
        System.out.println(h.name+"受攻击，生命值减少100");
        System.out.println("英雄信息更新：");
        h.print();
    }
    public void Fight(Hero h,int n) {
        System.out.println("----------------------------------------------------");
        h.health-=n;
        System.out.println(h.name+"受攻击，生命值减少"+n);
        System.out.println("英雄信息更新：");
        h.print();
    }
     void HFight(Hero opponent) {

         opponent.health-= 10;

     }

     void HFight(Hero opponent, int skill) {

         opponent.health -= 10;

         if (skill == 3) {

             opponent.health -= 10;

         } else if (skill == 2) {

             opponent.health -= 6;

         } else if (skill == 1) {

             opponent.health -= 3;

         }

     }
}