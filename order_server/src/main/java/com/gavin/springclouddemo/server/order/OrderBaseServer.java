package com.gavin.springclouddemo.server.order;

import com.gavin.springclouddemo.api.IOrderBaseServer;
import com.gavin.springclouddemo.entity.OrderInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavin on 2018/10/10.
 */
@RestController
public class OrderBaseServer implements IOrderBaseServer {

    @Value("${server.port}")
    private String serverPort;

    @ResponseBody
    @Override
    public OrderInfo getOrderInfoByUserName(String userName) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setUserName(userName);
        orderInfo.setOrderId("10001-"+serverPort);
        orderInfo.setOrderAmount(1500.00);
        return orderInfo;
    }

    @Override
    public String getOrderWithSleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "获取订单2秒延时,调用成功";
    }
}
