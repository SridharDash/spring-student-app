package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 1;
    private String name = "Java Spring Certification";
    private String dateOfCompletion = "2024";

    public void display() {
        System.out.println("Certification ID: " + id);
        System.out.println("Certification Name: " + name);
        System.out.println("Completed On: " + dateOfCompletion);
    }
}