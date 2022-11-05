package d2_static_until;

public class SingleInstance2 {
    private static SingleInstance2 instance2;
    public static SingleInstance2 getInstance(){
        if (instance2==null){
            instance2 =new SingleInstance2();
        }
        return instance2;
    }
    private SingleInstance2(){

    }
}
