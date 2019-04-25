package com.company;

import java.util.Scanner;

public class Enrolls {
        private String courses;
        private int tutionBalance =0;
        private static int costOfCourse = 600;

        public void enrollment(){
            do{
                System.out.println(" \nEnter Course to Enroll (Q to Exit): ");
                Scanner scanner = new Scanner(System.in);
                String course = scanner.nextLine();

                if(!course.equals("Q")){
                    courses = courses + "\n" + course;
                    tutionBalance = tutionBalance + costOfCourse;
                }
                else {break;}
            }while (1 != 0);
        }

    public String getCourses() {
        return courses;
    }

    public int getTutionBalance() {
        return tutionBalance;
    }
    
}
