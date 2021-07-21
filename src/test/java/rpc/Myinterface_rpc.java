package rpc;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface Myinterface_rpc extends VersionedProtocol {
    public static final long versionID=1L;
    String findName(String studentId);
}
