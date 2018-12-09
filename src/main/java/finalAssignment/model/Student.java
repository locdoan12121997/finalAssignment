package finalAssignment.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(nullable = false, unique = true)
    private String studentId;

    @Column()
    private String name;

    @Column()
    private String dob;

    @Column()
    private String email;

    @Column()
    private String phone;

    @Column()
    private String address;


    @Column()
    private String batch;

    public Student() {
    }

    public Student(String studentId, String name, String dob, String email, String phone, String address, String batch) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.batch = batch;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return studentId + " | " +
                name + " | " +
                dob + " | " +
                email + " | " +
                phone + " | " +
                address + " | " +
                batch + " | ";
    }
}