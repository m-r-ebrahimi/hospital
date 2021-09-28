package entity;

public class Bed {
    private int id;
    private Type type;
    private int wardId;

    public Bed(Type type, int wardId) {
        this.type = type;
        this.wardId = wardId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getWardId() {
        return wardId;
    }

    public void setWardId(int wardId) {
        this.wardId = wardId;
    }
}
