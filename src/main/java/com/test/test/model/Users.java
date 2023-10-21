package com.test.test.model;

import jakarta.persistence.*;

import javax.sound.midi.Sequence;


@Entity
@Table(name = "users_table")
public class Users {
    @Id
    @SequenceGenerator(
            name = "userSeq",
            sequenceName = "userSeq",
            allocationSize = 1
    )
   @GeneratedValue(
           strategy = GenerationType.SEQUENCE,
           generator = "userSeq"
   )

    @Column(
            name = "UserID",
            updatable = false
    )
    private Long id;

    @Column(
            name = "FirstN",
            nullable = false,
            columnDefinition = "Text"
    )
    private String fname;

    @Column(
            name = "LastN",
            nullable = false,
            columnDefinition = "Text"
    )
    private String lname;

    @Column(
            name = "Age"
    )
    private Integer age;

    public Users(Long id, String fname, String lname, Integer age) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    public Users(String fname, String lname, Integer age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public Users() {

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
