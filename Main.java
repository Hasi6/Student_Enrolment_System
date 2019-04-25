package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


//        Calling the student method
        Print print = new Print();
        print.printDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to see the balance? \t Then Press 1 or press 0");
        int choice = scanner.nextInt();

        if (choice == 1){
            Balance balance = new Balance();
            balance.viewBalance();
        }
    }
}
