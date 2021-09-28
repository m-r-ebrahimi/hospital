package entity;

public enum Type {
    SURGERY("surgery"), TREATMENT("treatments"), OTHER("other");

    private String type;

    Type(String type) {
        this.type = type;
    }
}
