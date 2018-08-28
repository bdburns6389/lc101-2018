package com.BrianBurns;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Used to parse incoming data from user (similar to "input()" in python)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth ");
        // hasNextInt will confirm if following scanner input is of type int,
        //if not, returns false
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            //.nextInt() will automatically convert incoming text into an integer
            int yearOfBirth = scanner.nextInt();
            //handle next line character (enter key)
            //basically, keeps the program from skipping asking for your name below
            scanner.nextLine();


            System.out.print("Enter your name: ");
            //will ask for input, and store it in name variable
            String name = scanner.nextLine();

            int currentYear = Year.now().getValue();
            int age = currentYear - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println(age);
                System.out.println("Your name is " + name);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        // scanner needs to be closed, or will potentially cause errors
        scanner.close();


    }
}
