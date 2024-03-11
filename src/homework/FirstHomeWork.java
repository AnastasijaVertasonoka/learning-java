package homework;

import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {
        //Easy peasy: Write a Java program that checks if a given number is positive. If it is, print "Positive number."
        int number = 10;
        if (number < 0) {
            System.out.println("this is negative number");
        } else if (number == 0) {
            System.out.println("this is zero");
        } else if (number > 0) {
            System.out.println("this is positive number");
        }

        // Odd or even: Create a Java program that determines if a given integer is even. If it is, print "Even number."

        int number2 = 5;
        if (number2 / 2 == 0) {  // Zero also even
            System.out.println("this is even number");
        } else {
            System.out.println("this is odd number");
        }

        //Age group classifier: Write a Java program that classifies a person into different age groups based on their age. If the age is less than 18, print "Teenager," otherwise print "Adult."

        int age = -17;
        if (age <= 18 && age >= 0) {
            System.out.println("Teenager");
        }

        if (age >= 19) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid age entered");
        }

        //Leap year checker: Create a Java program that checks if a given year is a leap year. If it is, print "Leap year."

        int year = 1998;
        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Lead Year");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("Lead year");
        }
        else {
            System.out.println("Not Lead year");
        }

        // Multiple conditions: Write a Java program that checks if a given number is positive, even, and less than 100. If all conditions are true, print "Valid number."

        int Number = 98;

        if ((Number>0 && Number<100) && Number%2 ==0) {
            System.out.println("Valid number.");
        }
        else {
            System.out.println("Not valid number");
        }

        // Nested conditions: Create a Java program that checks if a number is positive, and if so, check if it's even. If both conditions are true, print "Positive and Even."

        int isPositive = 0;

        if ((isPositive>0 && isPositive!=0) && isPositive%2 ==0) {
            System.out.println("Positive and Even number");
        }
        else {
            System.out.println("Not valid number");
        }

        // Character type identifier: Write a Java program that determines if a given character is a vowel. If it is, print "Vowel." (Use variable with data type: char. When checking character use == and ||)

        char z ='i';

        if (z=='a' || z=='e' || z=='i' || z=='o' || z=='u') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Not Vowel");
        }

        //BMI calculator: Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges. Print the category based on the BMI. Formula: bmi = weight / (height * height);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("Input height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
    }







}















