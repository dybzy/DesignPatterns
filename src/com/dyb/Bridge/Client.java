package com.dyb.Bridge;

/**
 * @author dyb
 * @date 2020-01-06 9:41
 */
public class Client {
    public static void main(String[] args) {
        //华为匹配32G
        Phone huawei=new HuaWei();
        huawei.buyPhone();
        huawei.setPhoneMemory(new Memory32G());

        //小米匹配64G
        Phone xiaoMi = new XiaoMi();
        xiaoMi.buyPhone();
        xiaoMi.setPhoneMemory(new Memory64G());

    }
}
