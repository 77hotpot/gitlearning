package tdy.test;

public class main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero(1);
        Hero h3 = new Hero(2);
        h3.HFight(h1,1);
        h3.print();
        h2.Fight(h2);
        h2.print();
        ;
        h3.Fight(h3,5);
        h3.print();
        ;

    }
}
