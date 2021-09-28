package test;

public enum Sex {
    MALE(1),FEMALE(2);
    private int sex;

    Sex(int sex) {
        this.sex = sex;
    }



    public  int getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "sex=" + sex +
                '}';
    }
}
