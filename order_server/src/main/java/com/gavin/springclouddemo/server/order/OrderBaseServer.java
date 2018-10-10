package com.gavin.springclouddemo.server.order;

import com.gavin.springclouddemo.api.IOrderBaseServer;
import com.gavin.springclouddemo.entity.OrderInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavin on 2018/10/10.
 */
@RestController
public class OrderBaseServer implements IOrderBaseServer {

    @ResponseBody
    @RequestMapping(value="getOrderInfo", method= RequestMethod.POST)
    @Override
    public OrderInfo getOrderInfoByUserName(String userName) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setUserName(userName);
        orderInfo.setOrderId("10001");
        orderInfo.setOrderAmount(1500.00);
        return orderInfo;
    }
}
