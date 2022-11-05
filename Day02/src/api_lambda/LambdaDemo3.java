package api_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer []ages1={34,12,42,23};
        Arrays.sort(ages1, (o1, o2) ->
            o2-o1
                );
                /* new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
            return o2-o1;
            }
        });*/
        System.out.println(Arrays.toString(ages1));


    }
}
