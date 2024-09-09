package cn.ken.master.server.core;

import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class AppContainer {

    private static final Map<String, Socket> SOCKET_MAP = new HashMap<String, Socket>();

    public static Socket getSocket(final String host, final int port) {
        String key = getKey(host, port);
        return SOCKET_MAP.get(key);
    }

    public static void addSocket(final Socket socket) {
        InetAddress inetAddress = socket.getInetAddress();
        String hostAddress = inetAddress.getHostAddress();
        int port = socket.getPort();
        SOCKET_MAP.put(getKey(hostAddress, port), socket);
    }

    private static String getKey(String hostAddress, int port) {
        return hostAddress + ":" + port;
    }
}
