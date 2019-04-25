package com.company;

public class StudentId {

    Student student = new Student();
    private int id = 0;

    public String setId(){
        id++;
        return student.getYear()+ "" + id;
    }

}
