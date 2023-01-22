package homework.lesson17SkillDesk;

/*
Дано два числа, например 3 и 56, значение которых хранятся в переменных.
a)Необходимо составить следующие текстовые строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используйте метод StringBuilder.append().
b)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
c)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */
public class Task3 {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 56;
        int sum = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;

        StringBuilder stringBuilderSum = new StringBuilder(num1 + " + " +num2+ " = " +sum);
        System.out.println(stringBuilderSum);

        StringBuilder stringBuilderMinus = new StringBuilder(num1 + " - " +num2+ " = " +minus);
        System.out.println(stringBuilderMinus);

        StringBuilder stringBuilderMultiply = new StringBuilder(num1 + " * " +num2+ " = " +multiply);
        System.out.println(stringBuilderMultiply);

    }
}
