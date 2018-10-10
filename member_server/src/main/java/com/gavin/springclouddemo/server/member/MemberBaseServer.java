package com.gavin.springclouddemo.server.member;

import com.gavin.springclouddemo.entity.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavin on 2018/10/10.
 */
@RestController
public class MemberBaseServer {

    @Autowired
    public IFeignOrderBaseServer orderService;

    @ResponseBody
    @RequestMapping(value = "getMemberInfo",method = RequestMethod.GET)
    public String getMemberInfo(){
        return "name: gavin , age: 28";
    }

    @ResponseBody
    @RequestMapping(value = "getMemberOrderInfo",method = RequestMethod.GET)
    public String getMemberOrderInfo(){
        OrderInfo orderInfo =  orderService.getOrderInfoByUserName("gavin");
        return orderInfo.toString();
    }

    @RequestMapping(value = "getSleepOrderInfo",method = RequestMethod.GET)
    public String getSleepOrderInfo(){
        String orderInfo =  orderService.getOrderWithSleep();
        return orderInfo;
    }

}
