package com.ly.demo01;

/**
 * 租房子的人
 */
public class Client {
    public static void main(String[] args) {
        // 房东，出租房子
        Landlord landlord = new Landlord();
        // 代理，帮房东出租房子，但是代理角色会增加一些附属操作
        Proxy proxy = new Proxy(landlord);
        // 客户，找代理租房子
        proxy.rent();
    }
}
