package cn.ken.master.server.core;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

@Slf4j
@Component
public class AppManager {

    @PostConstruct
    public void init() {
//        try (
//                ServerSocket serverSocket = new ServerSocket(8888)
//        ){
//            Socket appSocket = serverSocket.accept();
//            InputStream inputStream = appSocket.getInputStream();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
