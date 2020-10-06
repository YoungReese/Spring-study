package com.ly.demo01;

/**
 * 代理角色
 */
public class Proxy implements Rent {

    private Landlord landlord; // 通过组合方式拿到房东

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    public void rent() {
        seeHouse();
        landlord.rent();
        signContract();
        agencyFee();
    }

    // 看房子
    public void seeHouse() {
        System.out.println("中介带你看房子");
    }

    // 签合同
    public void signContract() {
        System.out.println("签租赁合同");
    }

    // 收中介费
    public void agencyFee() {
        System.out.println("收中介费");
    }
}
