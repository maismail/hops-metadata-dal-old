package io.hops.metadata.yarn.entity;

/**
 * Pojo representing Token class.
 */
public class Token {

    private int id;
    private byte[] identifier;
    private String kind;
    private byte[] password;
    private String service;

    public Token(int id, byte[] identifier, String kind, byte[] password,
        String service) {
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
