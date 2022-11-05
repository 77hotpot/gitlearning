package Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Account account = new Account();
        ArrayList<Account> ac = new ArrayList();
        while (true) {
            System.out.println("=======欢迎您进入北国银行ATM系统======");
            System.out.println("1.登录账户");
            System.out.println("2.注册开户");
            System.out.println("请您输入命令1、2选择对应的操作：");
            Scanner scanner = new Scanner(System.in);
            int sc = scanner.nextInt();
            switch (sc) {
                case 1:
                    System.out.println(ac.size());
                    LockIn(account,ac);
                    break;
                case 2:
                    creat(ac);
                    break;
                default:
                    System.out.println("您输入的操作命令不存在！");
            }
        }
    }

    public static void LockIn(Account account,ArrayList<Account> ac) {
        System.out.println("========系统登录操作=====");
        Random random = new Random();
        if (ac.size()==0){
            System.out.println("抱歉，当前系统中无账户，请先开户！");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请您输入账户卡号：");
            String cardId = scanner.next();
            Account acc=getAccountCArdId(cardId,ac);
            if(acc!=null) {

                    System.out.println("请输入您的密码");
                    String passWord=scanner.next();
                    //判断密码是否一致
                    if(acc.getPassword().equals(passWord)){
                        //登录成功
                        System.out.println("恭喜"+acc.getName()+"先生/女士登录成功");
                        showMenu(scanner,acc,ac);
                        return;
                    }else{
                        System.out.println("抱歉，您输入的密码有误！~~请重新输入");
                    }

            }else{
                System.out.println("对不起，您输入的卡号不存在！");
            }
        }

    }

    public static void creat(ArrayList<Account> ac) {
        System.out.println("========系统开户操作=======");
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        Random random = new Random();
        String username="";


        System.out.println("请您输入账户用户名：");
        username = scanner.next();
        account.setName(username);
            while (true) {
                 System.out.println("请输入您的账户密码：");
            String okpassWord = scanner.next();
            System.out.println("请您输入确认密码：");
            String passWord = scanner.next();
            if (okpassWord.equals(passWord)) {
                account.setPassword(passWord);
                break;
            } else {
                System.out.println("对不起，您输入的两次密码不一致，请重新输入~~");
            }
        }
            System.out.println("请输入您的限取金额：");
            Double money = scanner.nextDouble();
            account.setLimitMoney(money);
            String cardId = getRandomCardId(ac);
            account.setCardId(cardId);
            ac.add(account);
            System.out.println("恭喜" + username + "先生/女士，您开户成功！\n您的卡号是：" + cardId);

        return;
    }

    private static String getRandomCardId(ArrayList<Account> ac) {
        Random random = new Random();
        String CardId = null;
        while (true) {
            CardId = "";
            for (int i = 0; i < 8; i++) {
                int id = random.nextInt(10);
                CardId += id;
            }
//查询有无重复
            Account acc = getAccountCArdId(CardId, ac);
            if (acc == null) {
                return CardId;
            }
        }
    }
    //判断卡号重复不

    private static Account getAccountCArdId(String CardId,ArrayList<Account> ac){
        for (int i = 0; i < ac.size(); i++) {
           Account acc= ac.get(i);
           if(acc.getCardId().equals(CardId)){
               return acc;
           }
        }
        return null;//查无此账户
    }
    private static void showMenu(Scanner scanner,Account account,ArrayList<Account> ac){
        while (true) {

        System.out.println("=============欢迎您进入北国银行用户操作系统==========");
        System.out.println("请选择您要进行的操作：");
        System.out.println("1.查询\n2.存款\n3.取款\n4.转账\n5.修改密码\n6.退出\n7.注销当前账户");
        System.out.println("您可继续选择功能进行操作了。");

            int wo=scanner.nextInt();
            switch (wo){
                case 1:
                    //查询
                    showAccount(account);
                    break;
                case 2:
                    //存款
                saveMoney(scanner,account);
                    break;
                case 3:
                    //取款
                useMoney(scanner,account);
                    break;
                case 4:
                    //转帐
                    removeMoney(scanner,account,ac);
                    break;
                case 5 :
                    NewPassWord(scanner,account);
                    break;
                    //修改密码
                case 6:
                    //退出
                    System.out.println("退出成功,欢迎下次光临！");
                    return;
                case 7:
                    //注销当前账户
                    declect(account,ac);
                    return;
                default:
                    System.out.println("您输入的操作不存在！~~~请重新选择");
            }
        }
    }

    private static void declect(Account account, ArrayList<Account> ac) {
        boolean wow=ac.remove(account);
        while(wow) {
            System.out.println("注销成功！~~~~~~欢迎您再次使用北国银行ATM系统！~~~");
            return;
        }
    }

    private static void removeMoney(Scanner scanner, Account account,ArrayList<Account> ac) {
        System.out.println("========欢迎来到转账系统=========");
        double reMoney = 0;
        System.out.println(ac.size());
        if (ac.size()< 2) {

            System.out.println("当前银行系统不足两个账户，无法进行转账操作！~~~~~请去开户吧");
            return;
        }
        if (account.getMoney() == 0) {
            System.out.println("抱歉！~~当前账户无余额！无法进行转账~~~~");
            return;
        }

        int t = 0;
        while (true) {
            System.out.println("请输入您要转帐的账户：");
            String useCarId = scanner.next();
            if (useCarId == account.getCardId()) {
                System.out.println("对不起，不能向自己转账！~~~~~~");
                continue;//进入下一次循环
            }

            if (getAccountCArdId(useCarId, ac) == null) {
                System.out.println("对不起不存在此账户，请您重新确认您输入的卡号");
                continue;
            } else {
                Account bc = getAccountCArdId(useCarId, ac);
                String userName = bc.getName();
                String tip = "*" + userName.substring(1);
                System.out.println("请输入[" + tip + "]的姓氏：");
                String preName = scanner.next();
                if (userName.startsWith(preName)) {
                    while (true) {
                        System.out.println("请输入您想转的金额");
                        reMoney = scanner.nextDouble();
                        if (reMoney > account.getMoney()) {
                            System.out.println("对不起您的当前余额不足！~~~~~ 您的余额现在为：" + account.getMoney() + "请重新输入您想转的金额~~~~~");
                            continue;
                        } else {
                            while (true) {

                            if (reMoney <= account.getLimitMoney()) {
                                bc.setMoney(bc.getMoney() + reMoney);
                                account.setMoney(account.getMoney() - reMoney);
                                System.out.println("转账成功！~~~~ 您的余额现在为："+account.getMoney());
                                return;

                            } else {
                                System.out.println("超过限取金额:" + account.getLimitMoney() + "~~~~~~请重新输入");
                                continue;
                            }}

                        }
                    }
                }

                    }


                }
            }


    private static void NewPassWord(Scanner scanner, Account ac) {
        System.out.println("============欢迎来到修改密码系统==========");
        while (true) {
            System.out.println("请输入您之前的密码:");
            String  scPassword=scanner.next();
            if (scPassword.equals(ac.getPassword())){
                while (true) {
                    System.out.println(" 请输入您的新密码");
                    String newPassword =scanner.next();
                    System.out.println("请再次输入您的密码，进一步确认");
                    String reNewPassWord=scanner.next();
                    if (newPassword.equals(reNewPassWord)){
                        ac.setPassword(newPassword);
                        System.out.println("恭喜" + ac.getName() + "先生/女士，您的密码修改成功！~~~~~");
                        return;
                    }else{
                        System.out.println("您两次输入的密码不一致，请再次确认~~~~");
                    }
                }
            }else {
                System.out.println("您输入的密码，不正确~~~~~请重新输入！");
            }
        }
    }

    private static void useMoney(Scanner scanner, Account account) {
        System.out.println("========欢迎来到取款系统=======");
        if (account.getMoney()<100){
            System.out.println("抱歉当前余额不足100，不能进行取钱工作.");
            return;
        }
        while (true) {
            System.out.println("请输入您想取走的金额：");
            double useMoney=scanner.nextDouble();
            if (useMoney<=account.getLimitMoney()) {
                if (useMoney <= account.getMoney()) {
                    account.setMoney(account.getMoney() - useMoney);
                    System.out.println("取款成功！");
                    System.out.println("您当前账户信息如下：");
                    showAccount(account);
                    return;
                } else {
                    System.out.println("余额不足哦！~~~您现在的余额是：" + account.getMoney() + "请重新输入您想取走的金额");
                }
            }else {
                System.out.println("您超过了您的限取金额！"+"您现在最多可取："+account.getLimitMoney()+"~~~~请重新选择您想取走的金额");
            }
        }
    }

    private static void  showAccount(Account account){
        System.out.println("=========当前账户信息如下===========");
        System.out.println("卡号："+account.getCardId());
        System.out.println("用户："+account.getName());
        System.out.println("余额："+account.getMoney());
        System.out.println("限额："+account.getLimitMoney());
        return;
    }
    private static double saveMoney(Scanner scanner,Account ac){
        System.out.println("=======欢迎来到存款系统======");
        System.out.println("请存入您想要的金额");
        double saveMoney=scanner.nextDouble();
        ac.setMoney(saveMoney+ac.getMoney());
        System.out.println("您当前账户信息如下：");
        showAccount(ac);
        return ac.getMoney();
    }

}



