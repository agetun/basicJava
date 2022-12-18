package homework.lesson5;

public class Task1_0 {

    /*Нагуглил, но не полностью разобрался как это работает. И не хватило
    ума написать этот алгоритм в один класс, пришлось создавать ещё один
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
