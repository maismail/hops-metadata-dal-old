package se.sics.hop.metadata.hdfs.entity.hdfs;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author salman
 */
public class HopINode implements Comparable<HopINode> {

    private int id;
    private String name;
    private int parent_id;
    private int is_dir;
    private int is_dir_with_quota;
    private long modification_time;
    private long access_time;
    private byte[] permission;
    private int is_under_construction;
    private String client_name;
    private String client_machine;
    private String client_node;
    private int generation_stamp;
    private long header;
    private String symlink;

    public HopINode(){
    }
    
    public HopINode(int id, String name, int parent_id, int is_dir, int is_dir_with_quota, long modification_time, long access_time, byte[] permission, int is_under_construction, String client_name, String client_machine, String client_node, int generation_stamp, long header, String symlink) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
        this.is_dir = is_dir;
        this.is_dir_with_quota = is_dir_with_quota;
        this.modification_time = modification_time;
        this.access_time = access_time;
        this.permission = permission;
        this.is_under_construction = is_under_construction;
        this.client_name = client_name;
        this.client_machine = client_machine;
        this.client_node = client_node;
        this.generation_stamp = generation_stamp;
        this.header = header;
        this.symlink = symlink;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getParentId() {
        return parent_id;
    }

    public int getIsDir() {
        return is_dir;
    }

    public int getIsDirWithQuota() {
        return is_dir_with_quota;
    }

    public long getModificationTime() {
        return modification_time;
    }

    public long getAccessTime() {
        return access_time;
    }

    public byte[] getPermission() {
        return permission;
    }

    public int getIsUnderConstruction() {
        return is_under_construction;
    }

    public String getClientName() {
        return client_name;
    }

    public String getClientMachine() {
        return client_machine;
    }

    public String getClientNode() {
        return client_node;
    }

    public int getGenerationStamp() {
        return generation_stamp;
    }

    public long getHeader() {
        return header;
    }

    public String getSymlink() {
        return symlink;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentId(int parent_id) {
        this.parent_id = parent_id;
    }

    public void setIsDir(int is_dir) {
        this.is_dir = is_dir;
    }

    public void setIsDirWithQuota(int is_dir_with_quota) {
        this.is_dir_with_quota = is_dir_with_quota;
    }

    public void setModificationTime(long modification_time) {
        this.modification_time = modification_time;
    }

    public void setAccessTime(long access_time) {
        this.access_time = access_time;
    }

    public void setPermission(byte[] permission) {
        this.permission = permission;
    }

    public void setIsUnderConstruction(int is_under_construction) {
        this.is_under_construction = is_under_construction;
    }

    public void setClientName(String client_name) {
        this.client_name = client_name;
    }

    public void setClientMachine(String client_machine) {
        this.client_machine = client_machine;
    }

    public void setClientNode(String client_node) {
        this.client_node = client_node;
    }

    public void setGenerationStamp(int generation_stamp) {
        this.generation_stamp = generation_stamp;
    }

    public void setHeader(long header) {
        this.header = header;
    }

    public void setSymlink(String symlink) {
        this.symlink = symlink;
    }

    public static enum Order implements Comparator<HopINode> {

        ByName() {
            @Override
            public int compare(HopINode o1, HopINode o2) {
                // TODO - JIM why not compare by ID - more efficient?
                return o1.compareTo(o2);
            }
        };

        @Override
        public abstract int compare(HopINode o1, HopINode o2);

        public Comparator acsending() {
            return this;
        }

        public Comparator descending() {
            return Collections.reverseOrder(this);
        }
    }

    @Override
    public final int compareTo(HopINode other) {
        String left = name == null ? "" : name;
        String right = other.name == null ? "" : other.name;
        return SignedBytes.lexicographicalComparator().compare(left.getBytes(), right.getBytes());
    }

    @Override
    public final boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null || !(that instanceof HopINode)) {
            return false;
        }
        if (name.equals(((HopINode) that).name)
                && this.id == ((HopINode) that).id
                && this.parent_id == ((HopINode) that).parent_id) {
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.name.getBytes());
    }
}
