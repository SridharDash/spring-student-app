package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private int studentId;
    private String name;
    private String course;
    private int year;

    public Student() {
        this.studentId = 201;
        this.name = "Alice";
        this.course = "Data Science";
        this.year = 2;
    }

    public void display() {
        System.out.println(studentId + " " + name + " " + course + " " + year);
    }
}