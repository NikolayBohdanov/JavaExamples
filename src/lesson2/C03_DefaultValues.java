package com.hillel.javaStarter;

public class C03_DefaultValues {

    static char count = '\u265E';


    public static void main(String[] args) {
        // На 7-й строке, создаем переменную с именем a, типа byte и не присваиваем ей никакого значения.

        byte a;
        boolean b;
        char c;
        String s;

        // На 14-й строке - ОШИБКА: Запрещается использование неинициализированной локальной переменной!

        System.out.println(count);
    }
}
