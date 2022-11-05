package abstractTest;

public abstract class Card {
    private String userName;
    private double Money;
    public abstract void pay(double money);

    public Card() {
    }

    public Card(String userName, double money) {
        this.userName = userName;
        Money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }
}
