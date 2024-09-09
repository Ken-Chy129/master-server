package cn.ken.master.server.core;

import cn.ken.master.core.model.Result;
import cn.ken.master.server.entity.AppDO;
import cn.ken.master.server.service.AppService;
import cn.ken.master.server.utils.ApplicationContextUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class AppRegisterHandler implements Runnable {

    private final Socket socket;

    public AppRegisterHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            Result<?> request = (Result<?>) objectInputStream.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        AppContainer.addSocket(socket);
    }

    private void registerApp() {
        AppService appService = ApplicationContextUtil.getBean(AppService.class);
        AppDO appDO = new AppDO();
        appService.insert(appDO);
    }
}
