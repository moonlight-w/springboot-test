package com.moon.config;

import com.moon.ws.MyHandShakeIntercetor;
import com.moon.ws.MyPushHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author wei
 * @create 2020/4/14
 * @since 1.0.0
 */
@Configuration
public class WebSocketConfig implements WebSocketConfigurer {
    @Bean
    public MyPushHandler pushHandler(){
        return new MyPushHandler();
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(pushHandler(),"/push").addInterceptors(new MyHandShakeIntercetor()).setAllowedOrigins("*");
    }
}