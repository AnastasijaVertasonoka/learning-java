package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {

        //Array
        // Bread, milk, eggs, fruits

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7,9,10,6,5,4};

        String[] seasons = {"Summer", "Winter", "Autumn", "Spring"};
        // xotim vizvatj Eggs -Bread =0, Milk=1, Eggs= 3 -- poetomu piwem 2
        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        // kak pomenjat 7 iz massiva na 2//nado dostatj -7

        grades[0] =2;
        System.out.println(grades[0]);

        //print all grades
        //System.out.println(grades); ====nerabotaet
        System.out.println(Arrays.toString(grades));

        //vizvatj 4islo kotorogo net .pod index =6

        //System.out.println(grades[6]);  // budet owibka

        //pustoj masiv sozdatj gde 4 4isla

        int[] emptyArray = new int[4];
        // [0] ,[0],[0],[0]
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] =1;
        emptyArray[1]=2;
        emptyArray[2]=3;
        emptyArray[3]=4;
        System.out.println(Arrays.toString(emptyArray));

        //create String array with names
        //Name count =5
        // And print all

        String[] names = {"Eva", "Sasha", "Olga", "Adam", "Nastja"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        //create empty array size 5
        //print empty array
        //update each array from 0 to a number of your choice
        //print them all

        int[] emptyArray2 = new int[6];
        System.out.println(Arrays.toString(emptyArray2));
        emptyArray2[0]=3;
        emptyArray2[1]=5;
        emptyArray2[2]=6;
        emptyArray2[3]=4;
        emptyArray2[4]=6;
        emptyArray2[5]=1;
        System.out.println(Arrays.toString(emptyArray2));

        //  FOR
        // print numbers from 0 till 10;

        for (int i = 0; i <=10; i++) {
            System.out.println(i);

        }

        //calculate sum from 1 to 100;
        //emample: 1+2+3+4+n...;

        int summa =0;
        for (int i = 0; i <=100 ; i++) {
            summa = summa + i;
        }
        System.out.println("sum" + summa);

        //print  Produkti

        for(int i =0; i< shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }
        //i=0 ; (counter)
        //check : if i <shoppingList.length (4);
        // i=i+1

        //1 interation: System.out.println(shoppingList(0));
        //2 : System.out.println(shoppingList(1))
        //3 : System.out.println(shoppingList(2))
        //4 : System.out.println(shoppingList(3))

        System.out.println("");
        for (String s: shoppingList) {
            System.out.println(s);
        }

        // print numbers from 10 to  0;

        for(int i = 10; i>=0; i--) {
            System.out.println(i);
        }

        // with while

        int counter =10;
        while (counter>=0) {
            System.out.println(counter);
            counter--;
        }

        //excercise : print even numb from 2 till 100 ;
        // print on one line;  system.out.print (not println)

        for (int i= 2; i<=100; i=i+2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //or
         for (int i=2; i<=100;i++) {
             if (i%2 ==0) {
                 System.out.print(i + " ");
             }
        }







    }
    }

