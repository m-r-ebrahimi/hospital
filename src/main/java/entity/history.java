package entity;

import java.sql.Date;

public class history {
    private int id;
    private int patientId;
    private Date hospitalize;
    private Date dehospitalize;

    public history(int patientId, Date hospitalize, Date dehospitalize) {
        this.patientId = patientId;
        this.hospitalize = hospitalize;
        this.dehospitalize = dehospitalize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Date getHospitalize() {
        return hospitalize;
    }

    public void setHospitalize(Date hospitalize) {
        this.hospitalize = hospitalize;
    }

    public Date getDehospitalize() {
        return dehospitalize;
    }

    public void setDehospitalize(Date dehospitalize) {
        this.dehospitalize = dehospitalize;
    }
}
