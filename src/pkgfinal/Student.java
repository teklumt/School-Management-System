package pkgfinal;

import java.util.Date;

public class Student {
    private int schNo;
    private String name;
    private String fatherName;
    private String motherName;
    private int dobDay;
    private int dobMonth;
    private int dobYear;
    private String contactNumber;
    private String address;
    private int doaDay;
    private int doaMonth;
    private int doaYear;
    private String classOfAdmission;
    private String presentClass;

    // Constructors

    public Student(int schNo, String name, String fatherName, String motherName, int dobDay, int dobMonth, int dobYear,
                   String contactNumber, String address, int doaDay, int doaMonth, int doaYear, String classOfAdmission, String presentClass) {
        this.schNo = schNo;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dobDay = dobDay;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
        this.contactNumber = contactNumber;
        this.address = address;
        this.doaDay = doaDay;
        this.doaMonth = doaMonth;
        this.doaYear = doaYear;
        this.classOfAdmission = classOfAdmission;
        this.presentClass = presentClass;
}
    // Getters

    public int getSchNo() {
        return schNo;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public int getDobDay() {
        return dobDay;
    }

    public int getDobMonth() {
        return dobMonth;
    }

    public int getDobYear() {
        return dobYear;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getDoaDay() {
        return doaDay;
    }

    public int getDoaMonth() {
        return doaMonth;
    }

    public int getDoaYear() {
        return doaYear;
    }

    public String getClassOfAdmission() {
        return classOfAdmission;
    }

    // Setters

    public void setSchNo(int schNo) {
        this.schNo = schNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDoaDay(int doaDay) {
        this.doaDay = doaDay;
    }

    public void setDoaMonth(int doaMonth) {
        this.doaMonth = doaMonth;
    }

    public void setDoaYear(int doaYear) {
        this.doaYear = doaYear;
    }

    public void setClassOfAdmission(String classOfAdmission) {
        this.classOfAdmission = classOfAdmission;
    }
    public String getPresentClass() {
        return presentClass;
    }

    public void setPresentClass(String presentClass) {
        this.presentClass = presentClass;
    }
}
