package innerclass_anonymous;

import javax.swing.*;

/*
*通过GUI编程，理解内部类的真实使用场景
*
* */
public class Test3 {
    public static void main(String[] args) {
        //创建窗口
        JFrame win=new JFrame("登录界面");
        //创建按钮对象
        JPanel panel=new JPanel();
        win.add(panel);
        JButton btn=new JButton("登录");
        //把按钮加在窗口上展示
        win.add(btn);
        //展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
