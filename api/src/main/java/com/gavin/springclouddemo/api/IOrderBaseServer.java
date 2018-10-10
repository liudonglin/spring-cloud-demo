package com.gavin.springclouddemo.api;

import com.gavin.springclouddemo.entity.OrderInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gavin on 2018/10/10.
 */
public interface IOrderBaseServer {

    @RequestMapping(value="getOrderInfo", method= RequestMethod.POST)
    OrderInfo getOrderInfoByUserName(@RequestParam(value = "userName") String userName);

    @RequestMapping(value="getOrderWithSleep", method= RequestMethod.POST)
    String getOrderWithSleep();
}
