package taskJava;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);    // Создаю ввод

    public void calc(){           // Метод для калькульятора

        while (true){      // Главный цикл(бесконечный)

            System.out.println("Введите число 1");    // Ввод чисел
            int a = scanner.nextInt();
            System.out.println("Введите число 2");
            int b = scanner.nextInt();

            System.out.println("Выберите операцию: \n" +   // Выбор операции
                    "Сложение  : + \n" +
                    "Вычетание : - \n" +
                    "Умножение : * \n" +
                    "Деление   : / \n" +
                    "Выход     : e \n");

            char c = scanner.next().charAt(0);

            switch (c){         // Определение выбранной операции
                case '+' :
                    add(a, b);
                    break;

                case '-' :
                    sub(a, b);
                    break;

                case '*' :
                    mul(a, b);
                    break;

                case '/' :
                    div(a, b);
                    break;

                case 'e' :
                    System.exit(0);
                    break;

                default:
                    System.out.println("Вы ввели некорректную команду");
            }
        }

    }

    private void div(int a, int b) {       // Методы, которые вызываются в зависимости от выбора
        System.out.println("Частное: " + (double)a/(double)b);
    }

    private void mul(int a, int b) {
        System.out.println("Произведение: " + a*b);

    }

    private void sub(int a, int b) {
        System.out.println("Разность: " + (a-b));

    }

    private void add(int a, int b) {
        System.out.println("Сумма: " + (a+b));
    }
}
