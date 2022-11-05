package com.tdy.hello;

import java.util.Random;

public class NumZU {
    public static void main(String[] args) {
        /*int [] arr={10,20,30};
        String [] names={"张三","李四","王五","叶修","西门龙霆","景佳人"};
        Random cs= new Random();
        int num=cs.nextInt(6);
        System.out.println(names[num]);
        System.out.println(names.length);
        int [] move=new int[4];
        move[1]=520;
        System.out.println(move[1]);*/
        int [] arr1={1,2,3};
        int [] arr2=arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        arr2[0]=99;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
