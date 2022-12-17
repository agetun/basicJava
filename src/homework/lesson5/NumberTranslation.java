package homework.lesson5;

import java.util.HexFormat;
import java.util.Scanner;

public class NumberTranslation {



    public static void main(String[] args) {


//2.Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
//обратно не разобрался как
        int number10a = 637;
        System.out.println("=================================================================");
        System.out.println("Task 2. Convert number from decimal to hexadecimal and versa");
        System.out.println("Number in decimal number:" + number10a);
        String convert16 = Integer.toHexString(number10a);
        System.out.println("Число в шестнадцатиричной системе: " + convert16);

        int decimal = 0x27D;
        System.out.println("Число 27D обратно в десятичной системе: " + decimal);

//3.Перевести 637 из десятичной в двоичную
        int number10b = 637;
        System.out.println("=========================================================");
        System.out.println("Task 3. Convert number from decimal to binary");
        System.out.println("Number in decimal number: " + number10b);
        String convert2 = Integer.toBinaryString(number10b);
        System.out.println("Number in binary system: " + convert2);

//4.11100111 перевести в десятичную
        int x1 = 0b11100111;
        System.out.println("=========================================================");
        System.out.println("Task 4. Convert number from binary to decimal");
        System.out.println("Number in binary number: 11100111");
        System.out.println("Number in decimal number: " + x1);


    }




}