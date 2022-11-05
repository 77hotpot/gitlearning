package Test;

public class Account {
    private String cardId;
    private String name;
    private String password;
    private double money;
    private double limitMoney;

    public Account() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(double limitMoney) {
        this.limitMoney = limitMoney;
    }
}
