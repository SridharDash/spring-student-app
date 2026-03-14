package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.model.Student;

public class MainXML {

    private static ApplicationContext context;

	public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

        student.display();
    }
}