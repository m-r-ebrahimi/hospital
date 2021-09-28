package entity;


import java.sql.Date;

public class Patient {
    private int id;
    private String name;
    private int age;
    private Sex sex;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
