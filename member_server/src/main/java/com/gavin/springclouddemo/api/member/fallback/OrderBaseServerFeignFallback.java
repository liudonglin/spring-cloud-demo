package com.gavin.springclouddemo.api.member.fallback;

import com.gavin.springclouddemo.api.member.feign.IOrderBaseServerFeign;
import com.gavin.springclouddemo.entity.OrderInfo;
import org.springframework.stereotype.Component;

/**
 * Created by Gavin on 2018/10/11.
 */
@Component
public class OrderBaseServerFeignFallback implements IOrderBaseServerFeign {
    @Override
    public OrderInfo getOrderInfoByUserName(String userName) {
        return null;
    }

    @Override
    public String getOrderWithSleep() {
        return "服务忙,请稍后重试";
    }
}
