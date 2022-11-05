package com.tdy.hello;

public class BreakContinue {
    public static void main(String[] args) {
        //break and continue 的使用
        for(int i=0;i<5;i++){
            if(i==2){
               continue;
            }
            System.out.println("干饭ing"+i);
        }
    }
}
