package Collection_pp;

import java.util.LinkedList;

public class LinedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> stack=new LinkedList<>();
        stack.addFirst("第1颗子弹");
        stack.addFirst("第2颗子弹");
        stack.addFirst("第3颗子弹");
        stack.addFirst("第4颗子弹");
        System.out.println(stack);
        System.out.println("===================");
        System.out.println(stack.getFirst());
        System.out.println(stack.remove());
        System.out.println(stack.getFirst());
        System.out.println(stack);


        LinkedList<String> queue=new LinkedList<>();
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);
        System.out.println(queue.getFirst());
        queue.pop();
        System.out.println(queue);
    }

}
