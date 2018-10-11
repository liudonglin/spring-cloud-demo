package com.gavin.springclouddemo.api.member.feign;

import com.gavin.springclouddemo.api.IOrderBaseServer;
import com.gavin.springclouddemo.api.member.fallback.OrderBaseServerFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by gavin on 2018/10/10.
 */
@FeignClient(name="order-server",fallback = OrderBaseServerFeignFallback.class)
public interface IOrderBaseServerFeign extends IOrderBaseServer {
}
