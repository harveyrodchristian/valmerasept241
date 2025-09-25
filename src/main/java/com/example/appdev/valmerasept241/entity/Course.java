package com.example.appdev.valmerasept241.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String description;

    @Column(nullable = false)
    private int units;

    // Constructors
    public Course() {}

    public Course(String description, int units) {
        this.description = description;
        this.units = units;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getUnits() { return units; }
    public void setUnits(int units) { this.units = units; }
}