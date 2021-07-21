package rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class Client_rpc {
    public static void main(String[] args) {
        try {
            Myinterface_rpc proxy = RPC.getProxy(Myinterface_rpc.class, 1L, new InetSocketAddress("127.0.0.1",9099), new Configuration());
//            System.out.println("输入学号：20210123456789");
            System.out.println("请输入学号：");
            Scanner input = new Scanner(System.in);
            String studentId = input.next();
            String studentName = proxy.findName(studentId);
            System.out.println(studentName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
