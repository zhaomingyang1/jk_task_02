package rpc;

import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;

public class Myinterfaceimpl_rpc implements Myinterface_rpc {
    @Override
    public String findName(String studentId) {
        System.out.println("收到学号："+ studentId);
        System.out.println(" - - - 开始查询 - - - ");
        String a = null;
        if (studentId.equals("20210123456789")) {
            System.out.println("心心");
            a = "心心";
        } else {
            System.out.println("请输入已录入的学号");
            a = null;
        }
        return a;
    }

    @Override
    public long getProtocolVersion(String s, long l) throws IOException {
        return 0;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        return null;
    }
}

