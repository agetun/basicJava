package lessons.lesson2HW;

public class Lesson2 {


    public static void main(String[] args) {

/*
Напишите программу, которая выводит на экран результат деления двух чисел.
 50/3

 */

    int x = 50;

    int y = 3;

    double z = x/y;


    /*
    Напишите программу, которая выводит на экран результат следующих операций:
 -5 + 8 * 6
 (55+9) % 9

     */

    int a = -5;
    int b = 8;
    int c = 6;

    int a1 = 55;
    int a2 = 9;
    int a3 = 9;
    int a4 = (55+9)%9;


    /*
    Напишите программу, которая выводит на экран значение переменной типа инт в квадрате (n* n). Предварительно обьявите эту переменную и задайте ее значение.
     */
    int b1 = 25;
    int sqr = b1*b1;


    /*
    Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9. Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10. Получается, у вас будет среднее арифметическое этих чисел в одной переменной. Распечатайте её через println. Сколько программа отбросила в дробной части?

     */

    int c0=0;
    int c1=1;
    int c2=2;
    int c3=3;
    int c4=4;
    int c5=5;
    int c6=6;
    int c7=7;
    int c8=8;
    int c9=9;

    double c10=(c0+c1+c2+c3+c4+c5+c6+c7+c8+c9)/10.0;

    /*
•Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб. Если клиент покупает товары вместе, то на них действует скидка 10% руб на всю покупку. Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму скидки от этой покупки.

     */

        int a11=1000;
        int b11=500;
        int ab=a11+b11;
        double abc=ab*0.1;

        System.out.println (ab);
        System.out.println (abc);

        /*
Автоматическая конвертация типов
         */

        int x7 = 1234567890;
        long x8 = x7* 100L;
        double y7 = x7;



        /*
        Текстовая переменная
         */

        String name1 = "Ivan";

        String name2 = "Petr";

        System.out.println ("Hi, "+name1+ "How are you?");
        System.out.println ("Hi, "+name2+ "How are you?");

        String text1 = "Hello";
        String text2 = "World";


        System.out.println (x7);







    System.out.println (c10);

    System.out.println (sqr);

    System.out.println (z);
    System.out.println (a4);


    }



}
