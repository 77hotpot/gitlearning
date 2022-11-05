package d2_static_until;

import java.util.ArrayList;

public class TestInLive {
    //1.定义一副牌，且只加载一次
    public   static ArrayList<String> cards= new ArrayList<>();

    //2.在main方法前把54张牌放进去，之后可以直接用
    static {
        //a.定义一个数组存储点数，类型确定个数确定
        String[] size={"3","4","5","6","7","8","9","10","J","Q","k","A","2"};
        //b.定义存花色
        String[] colors={"♥","♣","♦","♠"};
        //c.组合
        //遍历点数
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < colors.length; j++) {
             String card=size[i]+colors[j];
             cards.add(card);
            }
        }
        //单独加入大小王
        cards.add("大🥁");
        cards.add("小🥁");
    }
    public static void main(String[] args) {
        System.out.println("新牌："+cards);
    }
    static void ArrayList(int arr[]) {

    }
}
