package com.company;

public class Print extends Enrolls{

    StudentId student = new StudentId();


    public void printDetails(){

        System.out.print(student.student.getFirstName()+" "+student.student.getLastName()+" "+student.student.getYear());
        System.out.print(" "+student.setId());

        enrollment();
        System.out.println("\n");
        System.out.println(" Enrolled in: "+getCourses());
        System.out.println("Tution Balance is: "+getTutionBalance());
    }
}
