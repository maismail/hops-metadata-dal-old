package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo representing Priority class.
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopPriority {

    private int id;
    private int priority;

    public HopPriority(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }
}
