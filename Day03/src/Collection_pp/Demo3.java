package Collection_pp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        film f1=new film("长津湖",9.5,"吴京");
        film f2=new film("我和我的母亲",9.5,"吴京");
        film f3=new film("人生大事",9.5,"朱一龙");
        Collection<film> films = new ArrayList<>();
        films.add(f1);
        films.add(f2);
        films.add(f3);
        System.out.println(films);
    films.forEach(film -> {
        System.out.print(film.getName());
        System.out.print(film.getScores());
        System.out.println(film.getActor());
    });
        ArrayList<String> list=new ArrayList();
        list.add("dnkd");
    }
}
