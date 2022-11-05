package ShoppingTest;

import java.util.Scanner;

public class ShopCar {
    public static void main(String[] args) {
        //1.定义商品类
        //2.定义购物车对象，数组
        Shop1[] shopCar = new Shop1[100];
        //3.搭建操作框架
        while (true) {
            System.out.println("请您选择如下操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算商品的金额：pay");
            Scanner scanner = new Scanner(System.in);
             System.out.println("请您输入命令。");
            String command = scanner.next();
            switch (command) {
                case "add":
                    add(shopCar, scanner);
                    break;
                case "query":
                    query(shopCar);
                    break;
                case "update":
                    update(shopCar,scanner);
                    break;
                case "pay":
                    pay(shopCar);
                    System.out.println();
                    break;
                default:
                    System.out.println("没有该功能。");
            }
        }
    }

    public static void pay(Shop1[] shopCar) {
        query(shopCar);
        double money=0;
        for (int i = 0; i < shopCar.length; i++) {
            Shop1 s=shopCar[i];
            if(s!=null){
                money+=(s.getPrice() *s.getBuyNumber());
            }
            else {
                break;
            }
        }
        System.out.println("订单总金额是："+money);
    }

    public static void update(Shop1[] shopCar,Scanner scanner) {
        System.out.println("请输入你要修改的商品编号");
        int id=scanner.nextInt();
        Shop1 s=getShopById(shopCar,id);
        if(s==null){
            System.out.println("没有这个商品信息。");
        }
        else {
            //修改
            System.out.println("请您输入商品最新购买数量");
            int buyNumber=scanner.nextInt();
            s.setBuyNumber(buyNumber);
            System.out.println("修改成功啦！");
            query(shopCar);
        }

    }
    public static Shop1 getShopById(Shop1[] shopCar,int id){
        for (int i = 0; i < shopCar.length; i++) {
            Shop1 s= shopCar[i];
            if(s!=null){
                if(s.getId()==id){
                    return s;
                }
                else return null;
            }
        }
        return null;
    }
    public static void query(Shop1[] shopCar) {
        System.out.println("--------查询购物车信息如下---------");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");
        for (int i = 0; i < shopCar.length; i++) {
        Shop1 s=shopCar[i];
        if(s!=null){
            //显示这个商品对象
            System.out.println(s.getId()+"\t\t"+s.getName()+"\t\t\t"+s.getPrice()+"\t\t\t"+s.getBuyNumber());
        }
        else{
            //遍历结束
            break;
        }
        }
    }

    public static void add(Shop1[] shopCar,Scanner scanner) {
        //录入购买信息
        System.out.println("请您输入购买商品的编号");
        int id=scanner.nextInt();
        System.out.println("请您输入购买商品的名称");
        String name=scanner.next();
        System.out.println("请您输入购买的数量");
        int buyNumber =scanner.nextInt();
        System.out.println("请您输入购买的商品的价格");
        double price=scanner.nextDouble();
        //2.把商品信息封装为对象
        Shop1 s=new Shop1();
        s.setId(id);
        s.setName(name);
        s.setBuyNumber(buyNumber);
        s.setPrice(price);
        //3.把这个商品对象添加到数组中去。
        for (int i = 0; i < shopCar.length; i++) {
           if(shopCar[i]==null){
               shopCar[i]=s;
           break;
           }
        }
        System.out.println("您的商品"+ s.getName() +"添加到购物车成功。");
    }
}
