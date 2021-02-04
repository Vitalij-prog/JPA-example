package org.vital.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "supermarket_id")
    private Supermarket supermarket;

    @Column(name = "sellers_firstname")
    private String firstName;

    @Column(name = "sellers_secondname")
    private String secondName;

    @Column(name = "sellers_thirdname")
    private String thirdName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "work_experience")
    private int workExp;

    public Seller() {}

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", supermarket=" + supermarket +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", birthDate=" + birthDate +
                ", workExp=" + workExp +
                '}';
    }
}
