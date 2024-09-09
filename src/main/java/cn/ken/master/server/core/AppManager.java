package cn.ken.master.server.core;

import cn.ken.master.core.model.Result;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@Component
public class AppManager {

    @PostConstruct
    public void init() {
        try (
                ServerSocket serverSocket = new ServerSocket(8888);
                ExecutorService registerHandlerExecutor = Executors.newVirtualThreadPerTaskExecutor()
        ){
            while (true) {
                Socket appSocket = serverSocket.accept();
                registerHandlerExecutor.submit(new AppRegisterHandler(appSocket));


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
