public class ConditionalStatements {
    public static void main(String[] args) {
        // Conditional statements in Java allow to control the flow of your program based on certain conditions

        // If statements

        /*
        if (condition) {
        //code to be executed if the condition is true!
        }
         */

        if (true) {
            System.out.println("This code is executed!");
        }

        int x = 10;
        if (x>5) {
            System.out.println("x is greater than 5");
        }
        // ne visvetit >12 t.t 10 <12

        if (x>12) {
            System.out.println("x is greater than 12");
        }

        boolean isSpring = true;
        if (isSpring) {
            System.out.println("It is spring");
        }

        //esli false to ne visvetit kod

        boolean isSpring2 = false;
        if (isSpring2) {
            System.out.println("It is spring");
        }

        //what returns true or false
        // Comparison: >, <,>=, <=, ==, f=

        // if else

        // child <= 12 age;
        // teenager >= 13 age and <= 19;
        // adult >=20 and <=59
        // else : senior;

        // vivodit 4to rebenok
        int age = 10;
        if (age <=12) {
            System.out.println("this is child");
        }
        else {
            System.out.println("something else!");
        }

        // vivodit - something else tk 25 age
        int age2 = 25;
        if (age2 <=12) {
            System.out.println("this is child");
        }
        else {
            System.out.println("something else!");
        }

        // if-else-if -else
        int age3 = 50;
        if (age3<=12) {
            System.out.println("this is child");
        }
        else if (age3 >= 13 && age3 <= 19) {
            System.out.println("this is teenager");

        }

        else if (age3 >=20 && age3 <=59) {
            System.out.println("this is adult");
        }
        else {
            System.out.println("this is senior");
        }

        // Write a Java program that checks if a given number is positive, negative or zero;
        //step 1: define variable (int number = 10);
        // step2: create logic ;
        // print out message;


        // if number <0 message - negative
        // if number ==0 message - zero
        // if number >0 message - positive
        int number = 10;
        if (number<0) {
            System.out.println("this is negative number");
        }
        else if (number==0) {
            System.out.println("this is zero");
        }
        else if(number>0) {
            System.out.println("this is positive number");
        }

        // if the hour is between 7 amd 11, print : good morning;
        //if the hour is between 12 and 17, print : good afternoon;
        //if the hour is between 18 and 23, [rint : good evening;
        // if the hour is between 0 amd 7, print : good night;
        //in all enter cases should say that: Invalis hour provided;

        int hour = 40;
        if(hour>=7 && hour<=11) {
            System.out.println("good morning");
        }
        else if (hour>=12 && hour<=17) {
            System.out.println("good afternoon");
        }
        else if (hour>=18 && hour<=23) {
            System.out.println("good evening");
        }
        else if (hour>=0 && hour<=7) {
            System.out.println("good night");
        }
        else {
            System.out.println("Invalid " + hour);
        }





    }
}
