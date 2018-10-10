package com.gavin.springclouddemo.entity;

import java.math.BigDecimal;

/**
 * Created by gavin on 2018/10/10.
 */
public class OrderInfo {

    public String orderId ;

    public double orderAmount;

    public String userName;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId='" + orderId + '\'' +
                ", orderAmount=" + orderAmount +
                ", userName='" + userName + '\'' +
                '}';
    }
}
