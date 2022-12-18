package lessons.lesson2HW;

import java.util.Scanner;

public class Lesson2InputFromKeybord {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number -");
        int number = input.nextInt();
        input.nextLine();

        System.out.println("Please enter name -");
        String name = input.nextLine();



        System.out.println("Your number is -"+number);
        System.out.println("Your name is -"+name);
        System.out.println(" ");


    }
}

/*
К вопросу о том что у нас возникла ошибка когда мы в начале хотели ввести цифру, а потом строку.
Сначала нужно понять как работает scanner.nextLine().
Он дочитывает строку (по факту, он движется по массиву байт из InputStream консоли,
т.е. из System.in) до её конца (до \n, либо \r\n, в зависимости от среды),
после чего останавливается на первом же символе после символа(ов) конца строки,
а все что он прочитал (за исключением символа(ов) конца строки он возвращает в качестве результата вызова).
Перед nextLine() мы вызывали nextInt(), который считывает число из InputStream консоли и останавливает
свой указатель на первым же символе после окончания числа, в нашем случае, т.к. после ввода числа мы нажали enter
у нас там находится символ(ы) перевода строки.
Поэтому когда мы  вызывали nextLine(), который согласно вышеописанному механизму читает все символы до конца строки
и останавливается, но в вашем случае он уже стоял на символе конца строки,
поэтому он просто сдвинул свой указатель на первый же символ после символа(ов) конца строки и остановился,
а в результате своего вызова вернул пустую строку ("").
Решение проблемы:
Самый простой способ: написать nextLine(); сразу же после вызова scanner.nextInt();
для перевода scanner на следующую строку (указатель в считываемом InputStream смещается
на первый символ после символа(ов) конца текущей строки), где ввод символа контра строки
еще не был осуществлен (т.к. её ввод, вообще, еще не был осуществлен).
Альтерантивный (чуть более сложный) способ решения проблемы: изначально вместо nextInt() использовать nextLine()
после чего самостоятельно выполнить парсинг (буквально - "разбор", но по смыслу - первформатирование,
распознавание, оцифрование) значения int посредством статического метода Integer.parseInt()
 */

