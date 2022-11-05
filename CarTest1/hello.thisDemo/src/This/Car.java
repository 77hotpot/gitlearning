package This;

public class Car {
    String name;
    double price;
  public Car(){
        System.out.println("这是无参数构造器中的this"+this);
    }
    public Car(String name,double price){
        this.name =name;
        this.price=price;
    }
    public void run(){
        System.out.println("这是方法中的this"+this);
    }
    public void gowith(String name){
        System.out.println(this.name+"正在和"+name+"一起比赛");
    }
}

