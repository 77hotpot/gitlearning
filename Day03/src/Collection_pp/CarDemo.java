package Collection_pp;

import java.util.ArrayList;

public class CarDemo {
    public static void main(String[] args) {
    ArrayList<BWM> bwms=new ArrayList<>();
    bwms.add(new BWM());
    bwms.add(new BWM());
    bwms.add(new BWM());
    go(bwms);
    ArrayList<Dog> dogs=new ArrayList<>();
    //go(dogs);
    }
    public static void go(ArrayList<?extends Car> cars){}

}
class Dog{

}
class Car{

}
class BWM extends Car{

}
class BENZ extends Car{

}