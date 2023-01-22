package taskJava;

import java.util.Random;
import java.util.Scanner;

public class ScanRand {

     /*
    План занятия
    1) Циклы
    2) Условные операторы
    3) Классы
    4) Ответы на вопросы
     */

    /*
    Теория
    Java - объектно ориентированный язык, т.е. весь его код состоит из классов. В данной парадигме все является объектом,
    т.е. экземпляром некоторого класса(шаблона).
    Правильный подход с точки зрения ООП - вынос кода в отдельный файл(класс) - погружение в класс называется инкапсуляцией.
    Циклы и условные операторы - необходимые составляющие языка программирования(АЯП). Язык программирования способен решить
    любую задачу, которую можно решить с помощью алгоритма(компьютера), в отличие от языков разметки, таблиц стилей и т.д.
    Циклы позволяют многократно выполнять действия
    Итератор - переменная, которая позволяет двигаться по циклу.
    Циклы:
          Условие начала  Условие завершения    Выполнение шага цикла
    for(int i = 0;         i < 10;                     i++) {
           Тело цикла - то что делается в цикле
    }
    while(условие завершения цикла) {
       Тело цикла - то что выполняет цикл
    }
    do{
    Тело цикла
       }
    while(Условие завершения);
    Условные операторы позволяют управлять ходом выполнения программы
    if(Условие)
   {
   То что делаем, если наступило условие
   }
    else{
       То что делаем в противоположном случае
    }
    Оператор switch(переключатель) - позволяет обрабатывать состояния переменной
    int a;
    switch(a){
     case 1:
        System.out.println("a = 1");
     break;
      case 2:
        System.out.println("a = 2");
     break;
     default:
     System.out.println("Значение не установлено");
    }
    Методы(подпрограммы) - действия, которые вынесенны в отдельный блок, для возможности многократного использования
    и чистоты кода.
    Методы бывают двух видов: Функции и процедуры. Функции возвращают значения, процедуры нет. В Java процедуры имеют
    ключевое слово void - в сигнатуре метода, а функции тип возвращаемого значения, например, int
     */

    /*
    Заметки
    Правильный способ написания кода зачастую упирается в знание паттернов проектирования, в 9 из 10 случае существует
    уже описанный способ решения Вашей задачи, нужно только его найти. В 10 случае для поиска наилучшего решения требуется
    глубокое понимание принципов работы системы, позволяющее найти исключение из правил.
    switсh очень удобно использовать для работы с ДКА(детерминированные конечные автоматы) - способ обработки задачи путем
    сведения ее к конечному набору случаев.
    Scanner позволяет читать из консоли
     */

    /*
    Задачи
    1) Сделать калькулятор, будет принимать команды пользователя, будет выполнять арифметические операции: +, -, *, /
    2) Игра "Камень, ножницы, бумага"
     */


    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int a = 5;
        if(a< 5){
            System.out.println("Да");
        }
        else if( a > 10){
            System.out.println("a > 10");
        }
        else {

        }

        switch(a){
            case 1:       // Проверка значения a
                System.out.println("a = 1");  // Тело условия - будет выполнено, если соблюдено условие
                break;      // Завершения условия

            case 2:
                System.out.println("a = 2");
                break;

            default:           // Отработает, если ни одно из условий не удовлетворенно, блок необязательный
                System.out.println("Значение не установлено");
        }

        printHello();

        double d = pi();

        System.out.println(pi());

        double a1 = 100;
        double b = 120;

        check(a1, b);     // Вызываем метод

        check2(110, 190) ;

        // computers();

        // humanVSComputer();

        Calculator calculator = new Calculator();   // Создаю объект
        calculator.calc();   // Вызываю метод объекта

    }

    public static void humanVSComputer(){
        while (true){
            int a = random.nextInt(3) + 1;
            String str1 = "";
            switch (a) {         // В зависимости от числа присваиваем строку
                case 1:
                    str1 = "Ножницы";
                    break;

                case 2:
                    str1 = "Бумага";
                    break;

                case 3:
                    str1 = "Камень";
                    break;
            }
            System.out.println("Ведите ход: ");
            String str2 = scanner.next(); // Считываем строку
            System.out.print("Игрок 1: " + str1 + " Игрок 2: " + str2 + "\n");
            System.out.println(srp(str1, str2));

            System.out.println("Выйти? \n" +
                    "y - да\n" +
                    "n - нет");
            char c = scanner.next().charAt(0); // Считываю первый символ
            if(c == 'y'){
                break; // Завершаю цикл
            }
        }
    }

    public static void computers() throws InterruptedException { // Игра компьютера с компьютером
        while (true) {            // Бесконечный цикл
            int a = random.nextInt(3) + 1;  // 1- 3   Генерируем числа
            int b = random.nextInt(3) + 1;

            String str1 = "";      // Создаем строки
            String str2 = "";

            switch (a) {         // В зависимости от числа присваиваем строку

                case 1:
                    str1 = "Ножницы";
                    break;

                case 2:
                    str1 = "Бумага";
                    break;

                case 3:
                    str1 = "Камень";
                    break;

            }

            switch (b) {

                case 1:
                    str2 = "Ножницы";
                    break;

                case 2:
                    str2 = "Бумага";
                    break;

                case 3:
                    str2 = "Камень";
                    break;

            }

            System.out.print("Игрок 1: " + str1 + " Игрок 2: " + str2 + "\n");
            System.out.println(srp(str1, str2));   // Вызываем метод для игры
            Thread.sleep(1000);    // Делаем секундную задержку
        }
    }



    public static String srp(String str1, String str2){    // Метод для игры в "Камень, ножницы, бумага"
        if((str1.equals("Ножницы") || str1.equals("Бумага") || str1.equals("Камень")) &&         // Защита от неправильного ввода
                (str2.equals("Ножницы") || str2.equals("Бумага") || str2.equals("Камень")) ) {
            if (str1.equals("Ножницы") && str2.equals("Бумага")) {                // Проверяем, победил ли один из игроков
                return "Игрок 1 победил";
            } else if (str1.equals("Ножницы") && str2.equals("Камень")) {
                return "Игрок 2 победил";
            } else if (str1.equals("Камень") && str2.equals("Ножницы")) {
                return "Игрок 1 победил";
            } else if (str1.equals("Камень") && str2.equals("Бумага")) {
                return "Игрок 2 победил";
            } else if (str1.equals("Бумага") && str2.equals("Камень")) {
                return "Игрок 1 победил";
            } else if (str1.equals("Бумага") && str2.equals("Ножницы")) {
                return "Игрок 2 победил";
            } else {                  // Если совпали значения, значит ничья
                return "Ничья";
            }
        }
        else {
            return "Неправильный ввод";
        }

    }

    public static void check2(int a, int b){
        System.out.println(a>100 && b < 100);     // Выводит логическое выражение
    }

    public static void check(double a, double b){        // Проверяем условие, что температура обеих колб выше 100, но ниже 120
        if(a < 100 && b < 100){
            System.out.println("Слишком низкая температура");
        }
        else if(a> 120 && b > 120){
            System.out.println("Слишком высокая температура");
        }
        else {
            System.out.println("Все в порядке");
        }

    }


    public static void printHello(){    // Процедура
        System.out.println("Hello");
    }

    public static double pi(){    // Функция
        return 3.14;
    }

}
