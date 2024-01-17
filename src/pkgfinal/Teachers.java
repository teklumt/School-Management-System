
package pkgfinal;

public class Teachers {
    private String teacherId;
    private String name;
    private String dept;
    private String dob;
    private String contact;
    private String address;
    private String position;
    private String salary;

    // Constructors
    public Teachers(String teacherId, String name, String dept, String dob, String contact, String address,
            String position, String salary) {
        this.teacherId = teacherId;
        this.name = name;
        this.dept = dept;
        this.dob = dob;
        this.contact = contact;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }

    // Getters
    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return dept;
    }

    public String getDob() {
        return dob;
    }

    public String getContactNumber() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }

    // Setters
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
