package com.gavin.springclouddemo.server.member;

import com.gavin.springclouddemo.api.IOrderBaseServer;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by gavin on 2018/10/10.
 */
@FeignClient(name="order-server")
public interface IFeignOrderBaseServer extends IOrderBaseServer {
}
