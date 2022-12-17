package homework.lesson5;

import java.util.Scanner;

public class NumberTranslation {

    public static void main(String[] args) {

        System.out.println("=========================================================");
        System.out.println("Перевод числа из десятичной системы счисления в двоичную");
        int number10 = 637;
        System.out.println("Число в десятичной системе: " + number10);
        String convert = Long.toBinaryString(number10);
        System.out.println("Число в двоичной системе: " + convert);
    }
}