package api_lambda;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr={10,2,55,23,24,100};
        System.out.println(arr);
        String rs= Arrays.toString(arr);
        System.out.println(rs);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //二分数组，前提：排序
        int index= Arrays.binarySearch(arr,23);
        System.out.println(arr[index]);
        System.out.println(index);
    }
}
