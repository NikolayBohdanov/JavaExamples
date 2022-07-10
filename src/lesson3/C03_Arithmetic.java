package lesson3;

public class C03_Arithmetic {

    // Арифметические операторы (C03_Arithmetic Operators): +, -, *, /, %

    public static void main(String[] args) {

        byte a = 5;
        byte a2 = 5; byte c = (byte)(a + a2);

        // Addition (+)
        byte summand1 = 1, summand2 = 2; // Множественное объявление.
        int sum = 0;
        sum = summand1 + summand2;

        System.out.println(sum);

        // Subtraction (-)
        byte minuend = 5, subtrahend = 3;
        int difference = 0;
        difference = minuend - subtrahend;

        System.out.println(difference);

        // Multiplication (*)
        byte factor1 = 2, factor2 = 3;
        int product = 0;
        product = factor1 * factor2;

        System.out.println(product);

        // Division (/)
        byte dividend = 5, divisor = 2;
        int quotient = 0, remainder = 0;
        quotient = dividend / divisor;

        System.out.println(quotient);

        // Remainder after division (%)
        remainder = dividend % divisor;
//
//        5 % 2 = 1;
//        5 % 5 = 0;
//        5 % 15 = 5;
//        10 % 100 = 10;


        System.out.println(remainder);
    }
}
