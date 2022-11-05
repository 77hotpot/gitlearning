package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        Movie m1=new Movie("1",9.5,"woe");
        Movie m2=new Movie("2",8.5,"waddadoe");
        Movie m3=new Movie("3",9,"woedd");
        ArrayList<Movie> movies=new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        System.out.println(movies);

        for (int i = 0; i < movies.size(); i++) {
            Movie m=movies.get(i);
            System.out.println("名称："+m.getName());
            System.out.println("分："+m.getScore());
            System.out.println("演员："+m.getActor());
        }
    }
}
