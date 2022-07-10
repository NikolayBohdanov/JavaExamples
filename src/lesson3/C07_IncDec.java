package lesson3;

public class C07_IncDec {
    // Операторы Инкремента и Декремента (Increment and Decrement Operators)

    public static void main(String[] args) {

//        int a = 0;
//
//        System.out.println(a++); // a++    a = a + 1
//        System.out.println(++a);
//
//
//        int b = 1;
//        b = b - 1;
//        --b; b--;
//
//        System.out.println("----- Постфиксный инкремент"); // Post-increment
//
//        byte number1 = 0;
//        System.out.println(number1++); // Сначала выводим на экран, потом увеличиваем на 1.
//        System.out.println(number1);
//
//        System.out.println("----- Префиксный инкремент"); // Pre-increment
//
//        byte number2 = 0;
//        System.out.println(++number2); // Сначала увеличиваем на 1, потом выводим на экран.
//
//        System.out.println("----- Постфиксный декремент"); // Post-decrement
//
//        byte number3 = 0;
//        System.out.println(number3--); // Сначала выводим на экран, потом уменьшаем на 1.
//        System.out.println(number3);
//
//        System.out.println("----- Префиксный декремент"); // Pre-decrement
//
//        byte number4 = 0;
//        System.out.println(--number4); // Сначала уменьшаем на 1, потом выводим на экран.
//        int i = 0;
//
//        i = i + 1;
//        i += 1;
//        i = i + 5;
//        i += 5;
//
//        i = i - 10;
//        i -= 10;


        int a = 6, b = 4;
        a=++a + b++ +a++;
        int c = --a + b--;

        System.out.println("c= " + c + ",a= " + a + ",b= " + b);
        // a = 18,  b = 4, c = 22
    }
}
