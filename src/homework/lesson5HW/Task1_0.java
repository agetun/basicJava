package homework.lesson5HW;

public class Task1_0 {

    /*Не полностью разобрался как это работает. И не смог
    написать этот алгоритм в один класс, пришлось создавать ещё один класс.
    Остальная часть домашнего задания в другом классе.
    */

//0.Перевести число 333 из шестнадцатиричной в десятичную
    public static void main(String[] args) {

        int number16 = 333;
        System.out.println("=================================================================");
        System.out.println("Задание 0. Перевести число 333 из шестнадцатиричной в десятичную");
        System.out.println("Число в шестнадцатиричной системе: " + number16);
        System.out.print("Число в десятичной системе: ");
        System.out.print(hexToDec("333"));
        System.out.println();
        System.out.println("=================================================================");

    }
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }






}
