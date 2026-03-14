package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.model.Student;

public class MainApp {

    private static ApplicationContext context;

	public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        student.display();
    }
}