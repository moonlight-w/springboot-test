package com.moon.ws;

import com.moon.model.SysUser;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author wei
 * @create 2020/4/14
 * @since 1.0.0
 */
public class MyPushHandler extends TextWebSocketHandler {

    //客户端集合
   public Map<String,WebSocketSession> clients = new ConcurrentSkipListMap<String, WebSocketSession>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        SysUser user =(SysUser) session.getAttributes().get("user");
        System.out.println("连接建立"+user.getAccount());
        clients.put(session.getId(),session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
       SysUser user =(SysUser) session.getAttributes().get("user");
       System.out.println("连接关闭"+user.getAccount());
        clients.remove(session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        //send to clients
        for (Map.Entry<String,WebSocketSession> client : clients.entrySet()){
            client.getValue().sendMessage(message);
        }
    }
}