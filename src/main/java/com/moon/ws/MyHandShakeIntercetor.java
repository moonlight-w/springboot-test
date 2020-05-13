package com.moon.ws;


import com.moon.model.SysUser;
import com.moon.utils.BaseController;
import com.moon.utils.JwtUtils;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author wei
 * @create 2020/4/14
 * @since 1.0.0
 */
public class MyHandShakeIntercetor extends BaseController implements HandshakeInterceptor {
    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {


    }

    @Override
    public boolean beforeHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {
        ServletServerHttpRequest r = (ServletServerHttpRequest) serverHttpRequest;
        HttpServletRequest req = r.getServletRequest();
        //获得登录token/用户account
        String token = super.getCookieVal(req,"token");
        SysUser user = JwtUtils.getObject(token,SysUser.class);
        System.out.println("user!!!!!!!!"+user.getAccount());

         map.put("user",user);
        return true;
    }
}