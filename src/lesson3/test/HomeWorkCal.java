package lesson3.test;

import java.util.Scanner;

public class HomeWorkCal {

    private int a = 100;

    public static void main(String[] args) {
        final  int b = 10;
        final int[] arr = {4, 5, 10};

        System.out.println("\n\n♥♥♥ CALCULATION TEST1.2. ♥♥♥\n\n");

        // Input Numbers
        Scanner calculation = new Scanner(System.in);
        System.out.println("Input given numbers:");

        if (calculation.hasNextInt()) {
            int number1 = calculation.nextInt();
            int number2 = calculation.nextInt();
            System.out.println("***  Proceeding  ***");
            System.out.println("All available operations result:");
            divide(number1, number2);
            System.out.println("Add:\n" + add(number1, number2));
            System.out.println("Multiply:\n" + multiply(number1, number2));
            System.out.println("Subtract:\n" + subtract(number1,number2));

            
        } else System.out.println("Internal error. Please try again later");

    }

    public static void divide(int number1, int number2) {

        if (number2 != 0) {
            int result = number1 / number2;
            System.out.println("Divide:\n" + result);
        } else System.out.println("Internal error. Can't divide by zero\n");

    }

    public static int add(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public static int multiply(int number1, int number2){
        int result = number1 * number2;
        return result;
    }

    public static int subtract(int number1, int number2){
        int result = number1 - number2;
        return result;
    }
}

enum Colors {
    Read, Blue, Black;
}