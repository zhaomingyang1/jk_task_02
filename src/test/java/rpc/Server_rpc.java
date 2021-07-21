package rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class Server_rpc {
    public static void main(String[] args) {
        RPC.Builder builder = new RPC.Builder(new Configuration());
        //服务器ip地址
        builder.setBindAddress("127.0.0.1");
        //端口号
        builder.setPort(9099);
        builder.setProtocol(Myinterface_rpc.class);
        builder.setInstance(new Myinterfaceimpl_rpc());
        try {
            RPC.Server server = builder.build();
            server.start();
            System.out.println("server 已启动");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
