package com.gavin.springclouddemo.api.order.server;

import com.gavin.springclouddemo.api.IOrderBaseServer;
import com.gavin.springclouddemo.entity.OrderInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavin on 2018/10/10.
 */
@Api(value = "订单服务", description = "订单相关的服务", position = 1)
@RestController
public class OrderBaseServer implements IOrderBaseServer {

    @Value("${server.port}")
    private String serverPort;

    @ApiOperation(value = "根据会员名称获取会员订单信息", notes = "根据会员名称获取会员订单信息")
    @ApiImplicitParam(name = "userName", value = "会员名称", dataType = "String")
    @ResponseBody
    @Override
    public OrderInfo getOrderInfoByUserName(String userName) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setUserName(userName);
        orderInfo.setOrderId("10001-"+serverPort);
        orderInfo.setOrderAmount(1500.00);
        return orderInfo;
    }

    @ApiOperation(value = "获取订单信息", notes = "根据会员名称获取会员订单信息")
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
