package finalAssignment.model;

import javax.persistence.*;

@Entity
@Table(name = "lecturer")
public class Lecturer {
    @Id
    @Column(nullable = false, unique = true)
    private String lecturerId;

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
    private String department;

    public Lecturer() {
    }

    public Lecturer(String lecturerId, String name, String dob, String email, String phone, String address, String department) {
        this.lecturerId = lecturerId;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.department = department;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return lecturerId + " | " +
                name + " | " +
                dob + " | " +
                email + " | " +
                phone + " | " +
                address + " | " +
                department + " | ";
    }
}