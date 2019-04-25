package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Student {
   private String firstName;
   private String lastName;
   private String year;


//    constructor to get name and grade
    public Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Students First Name: ");
         this.firstName= scanner.next();

        System.out.println("Enter Students Last Name: ");
         this.lastName= scanner.next();

        System.out.println("Enter Students Year: ");
         this.year= scanner.next();

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getYear() {
        return year;
    }

}
