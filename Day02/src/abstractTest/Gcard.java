package abstractTest;

public class Gcard extends Card{
    @Override
    public void pay(double money){
        System.out.println("您当前消费：" + money);
        System.out.println("您当前卡内余额："+getMoney());
        System.out.println("您是尊贵的金卡用户，为您打8折优惠，所以您折后消费：" + money *0.8);
        setMoney(getMoney()-money*0.8);
        System.out.println("卡内余额：" + getMoney());
    }
}
