package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        //prompt the user to enter their testscore.
        System.out.println("Enter any number of your testscore");
        int userscore = src.nextInt();

         String usernew = "y";
        //creating while loop.

        while (usernew .equals("y")) {


            if (userscore >= 90) {
                System.out.println("Great job! Your grade is A. ");
            }
            if (userscore < 90 && userscore >= 80) {
                System.out.println("Goodjob! Your grade is B ");
            }
            if (userscore < 80 && userscore >= 70) {
                System.out.println("nice job! Your grade is C");
            }
            if (userscore < 70 && userscore >= 50) {
                System.out.println("You made it! Your grade is D ");
            }
            if (userscore <= 40) {
                System.out.println("Your Grade is F ");
            }

            userscore = 0;
            //src.nextInt();
            System.out.println("Do you want to enter another score (Y/N)?");
            usernew  = src.next();


            if (usernew.equalsIgnoreCase("Y")) {

                System.out.println("Enter any another testscore");
                userscore = src.nextInt();

            }
            if (usernew .equalsIgnoreCase("N")){
                System.out.print("Done");
            }
            }

        }



    }

