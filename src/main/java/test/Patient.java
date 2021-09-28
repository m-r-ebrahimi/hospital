package test;

import entity.Sex;

import java.sql.Date;

public class Patient {
    private int id;
    private String name;
    private int age;
    private entity.Sex sex;
    private Date birthdate;
    private String address;

    public Patient() {
    }

    public Patient(String name, int age, Sex sex, Date birthdate, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthdate = birthdate;
        this.address = address;
    }

}
