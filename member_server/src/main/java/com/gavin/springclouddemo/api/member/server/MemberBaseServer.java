package com.gavin.springclouddemo.api.member.server;

import com.gavin.springclouddemo.api.member.feign.IOrderBaseServerFeign;
import com.gavin.springclouddemo.entity.OrderInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavin on 2018/10/10.
 */
@RestController
@Api(value = "会员服务", description = "与基础信息相关的服务", position = 1)
@RefreshScope
public class MemberBaseServer {

    @Autowired
    public IOrderBaseServerFeign orderService;

    @ApiOperation(value = "获取会员订单信息", notes = "通过调用订单服务，返回会员订单")
    @ResponseBody
    @RequestMapping(value = "getMemberOrderInfo",method = RequestMethod.GET)
    public String getMemberOrderInfo(){
        OrderInfo orderInfo =  orderService.getOrderInfoByUserName("gavin");
        return orderInfo.toString();
    }

    @ApiOperation(value = "获取会员订单信息(包含两秒延迟)", notes = "通过调用订单服务，返回会员订单")
    @RequestMapping(value = "getSleepOrderInfo",method = RequestMethod.GET)
    public String getSleepOrderInfo(){
        String orderInfo =  orderService.getOrderWithSleep();
        return orderInfo;
    }

    @Value("${config_info}")
    private String config;

    @ApiOperation(value = "测试apollo获取配置信息", notes = "测试apollo获取配置信息")
    @RequestMapping("/getConfigInfo")
    public String getConfigInfo(){
        return config;
    }

}
