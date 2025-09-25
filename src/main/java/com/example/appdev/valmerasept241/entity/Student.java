package com.example.appdev.valmerasept241.entity;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 50)
    private String firstname;

    @Column(nullable = false, length = 50)
    private String lastname;

    @Column(nullable = false, length = 50)
    private String program;

    @Column(nullable = false)
    private int yearlevel;

    // Constructors
    public Student() {}

    public Student(String firstname, String lastname, String program, int yearlevel) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.program = program;
        this.yearlevel = yearlevel;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }
    public int getYearlevel() { return yearlevel; }
    public void setYearlevel(int yearlevel) { this.yearlevel = yearlevel; }
}
