package Eialid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Use If & switch statement to check the number is positive,negative or Zero by taking input from user.
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please input require number:");
        int num = userInput.nextInt();
        int result = switchMethod(num);

        if (num > 0) {
            System.out.println("User input: '" + num + "' is Positive Value");
        } else if (num < 0) {
            System.out.println("User input: '" + num + "' is Negative Value");
        } else {
            System.out.println("User input: '" + num + "' is Zero");
        }

        switch (result) {
            case 1:
                System.out.println("switch statement " + num + " is positive");
                break;
            case -1:
                System.out.println("switch statement " + num + " is Negative");
                break;
            default:
                System.out.println("switch statement " + num + " is Zero");
                break;
        }

        // check even or odd from user input
        int val=5;
        if (num % val == 0) {
            System.out.println("The number is Even as it is divided by "+val);
        } else {
            System.out.println("The number is Odd as it is not divided by "+val);}


        // Use If & switch statement to check the number is positive,negative or Zero by taking value from variable.
        int num1 = 1;

        if (num1 > 0) {
            System.out.println("Number(" + num1 + ") contain Positive Value");
        } else if (num1 < 0) {
            System.out.println("Number(" + num1 + ") contain Negative Value");
        } else {
            System.out.println("Number(" + num1 + ") contain Zero Value");
        }
        switch (num1) {
            case 1:
                System.out.println("Positive");
                break;
            case -1:
                System.out.println("Negative");
                break;
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Not match");
                break;
        }

        // check even or odd from variable value

        if (num1 - 1 ==0) {
            System.out.println("It is even");
        }
            else {
                System.out.println("It is Odd");
            }
        }



    //Using a new method to identify the match case which is used in switch statement
    public static int switchMethod(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }


    }

}



