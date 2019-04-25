package com.company;

public class Print {

    StudentId student = new StudentId();

    public void printDetails(){
        System.out.print("First Name is "+student.student.getFirstName()+" and last name is "+student.student.getLastName()+" and year is "+student.student.getYear()
        );
        System.out.print(" Student id is "+student.setId());
    }
}
