package entity;

public class DoctorForm {
    private int formId;
    private int doctorId;

    public DoctorForm(int formId, int doctorId) {
        this.formId = formId;
        this.doctorId = doctorId;
    }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
}
