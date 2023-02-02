package taskJava.taskJava7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Сумма " + calculator.sum(2,2));
//        System.out.println("Сумма " + calculator.mul(4,4));

        while (true) {
            System.out.println("Введите операцию:\n" +
                    "+ сложение\n" +
                    "- вычитание\n" +
                    "* умножение\n" +
                    "/ деление\n");
            char c = scanner.next().charAt(0);

            switch (c) {
                case '+':
                    System.out.println("Введите числа");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    System.out.println("Сумма " + calculator.sum(a,b));
                    break;

                case '-':
                System.out.println("Введите числа");
                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                System.out.println("Вычитание " + calculator.sab(a1,b1));
                break;

                case '*':
                    System.out.println("Введите числа");
                    double a2 = scanner.nextDouble();
                    double b2 = scanner.nextDouble();
                    System.out.println("Ответ " + calculator.mul(a2,b2));
                    break;

                case '/':
                    System.out.println("Введите числа");
                    double a3 = scanner.nextDouble();
                    double b3 = scanner.nextDouble();
                    System.out.println("Ответ " + calculator.div(a3,b3));
                    break;




            }
        }

    }
}
