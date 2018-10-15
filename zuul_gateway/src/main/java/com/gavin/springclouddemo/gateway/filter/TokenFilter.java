package com.gavin.springclouddemo.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * Created by Gavin on 2018/10/15.
 */
@Component
public class TokenFilter extends ZuulFilter {

    //pre表示在请求之前拦截
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    //过滤器执行顺序
    @Override
    public int filterOrder() {
        return 0;
    }

    //表示过滤器是否生效
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        //获取当前上下文
        RequestContext currentContent = RequestContext.getCurrentContext();

        HttpServletRequest request = currentContent.getRequest();

        String userToken = request.getParameter("userToken");

        /*if(StringUtils.isEmpty(userToken)){
            //阻止请求往下执行
            currentContent.setSendZuulResponse(false);
            //返回错误提示
            currentContent.setResponseBody("userToken is null");
            currentContent.setResponseStatusCode(401);
        }*/

        System.out.println("Zuul Filter ");

        return null;
    }
}
