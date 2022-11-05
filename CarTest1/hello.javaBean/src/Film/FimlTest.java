package Film;

public class FimlTest {

    public static void main(String[] args) {
    Movie m1=new Movie("长津湖",9.5,"吴京");
    Movie m2=new Movie("我和我的母亲",9.5,"吴京");
    Movie m3=new Movie("人生大事",9.5,"朱一龙");
    Movie [] arr= new Movie [3];
    arr[0] =m1;
    arr[1]=m2;
    arr[2]=m3;
        for (int i = 0; i < arr.length; i++) {
            Movie m=arr[i];
            System.out.println("电影名是"+m.getName()+"评分是："+m.getScore()+"主演是："+m.getActor());
            System.out.println("-----------------");
        }
    }
}
