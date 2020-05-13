package com.moon.controller;

import com.moon.utils.BaseController;
import com.moon.ws.MyPushHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.Map;
import java.util.Random;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author wei
 * @create 2020/4/13
 * @since 1.0.0
 */
@Controller
@RequestMapping("/moon/Push")
public class PushController extends BaseController {
    @Autowired
    MyPushHandler handler;

    @RequestMapping("/startRand")
    @ResponseBody
    public String startRand() throws InterruptedException {
        while (true){
            Random r = new Random();
            while (true){
              int res =  r.nextInt(9000)+1000;
                System.out.println("r="+res);
              if(res>5000){
                  return res + "";

              }
                Thread.sleep(1000);
            }
        }
    }
    @Scheduled(fixedDelay = 60000)
    public void exectask() throws IOException {
        Map<String, WebSocketSession> clients = handler.clients;
        for(Map.Entry<String,WebSocketSession> c:clients.entrySet()){
            c.getValue().sendMessage(new TextMessage("欢迎来到竞拍室!"));
        }
    }
}