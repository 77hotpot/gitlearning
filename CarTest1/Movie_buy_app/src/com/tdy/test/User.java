package com.tdy.test;

public class User {
    private String logName;
    private String password;
    private String trueName;
    private String sex;
    private String phoneNum;
    private Double leftMoney;
}
class Business extends User{
    private String busName;
    private String address;

}
class Customer extends User{

}