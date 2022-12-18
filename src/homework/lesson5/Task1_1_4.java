package homework.lesson5;

public class Task1_1_4 {



    public static void main(String[] args) {


//1.Разложить число 200345 на разряды в десятичной системе
        int number10 = 200345;
        int hundredThousand = 2*100000;
        int hundreds = 3*100;
        int tens = 4*10;
        int units = 5;
        System.out.println("=================================================================");
        System.out.println("Задание 1. Разложить число 200345 на разряды в десятичной системе");
        System.out.println("Разряд сотен тысяч: " + hundredThousand);
        System.out.println("Разряд сотен: " + hundreds);
        System.out.println("Разряд десятков: " + tens);
        System.out.println("Разряд единиц: " + units);


//2.Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
        int number10a = 637;
        System.out.println("=================================================================");
        System.out.println("Task 2. Convert number from decimal to HEX and versa");
        System.out.println("Number in decimal number:" + number10a);
        String convert16 = Integer.toHexString(number10a);
        System.out.println("Number in HEX system: " + convert16);

        int decimal = 0x27D;
        System.out.println("Number 27D in decimal: " + decimal);

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