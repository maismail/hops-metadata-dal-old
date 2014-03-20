package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing Token class.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopToken {

    private int id;
    private byte[] identifier;
    private String kind;
    private byte[] password;
    private String service;

    public HopToken(int id, byte[] identifier, String kind, byte[] password, String service) {
        this.id = id;
        this.identifier = identifier;
        this.kind = kind;
        this.password = password;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public byte[] getIdentifier() {
        return identifier;
    }

    public String getKind() {
        return kind;
    }

    public byte[] getPassword() {
        return password;
    }

    public String getService() {
        return service;
    }
}
