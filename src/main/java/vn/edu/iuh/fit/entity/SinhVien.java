package vn.edu.iuh.fit.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "sinh_vien")
public class SinhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mail;
    private LocalDate dob;

    public SinhVien() {
    }

    public SinhVien(long id, String name, String mail, LocalDate dob) {
        this.id =id;
        this.name = name;
        this.mail = mail;
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", dob=" + dob +
                '}';
    }
}
