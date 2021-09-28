package entity;

public class doctor {
    private int id;
    private String name;
    private String proficiency;
    private int seniority;

    public doctor(String name, String proficiency, int seniority) {
        this.name = name;
        this.proficiency = proficiency;
        this.seniority = seniority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
}
