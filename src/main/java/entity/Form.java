package entity;

import java.sql.Date;
import java.sql.Time;

public class Form {
    private int id;
    private Date date;
    private Time clock;
    private int patientId;

    public Form(Date date, Time clock, int patientId) {
        this.date = date;
        this.clock = clock;
        this.patientId = patientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getClock() {
        return clock;
    }

    public void setClock(Time clock) {
        this.clock = clock;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}

