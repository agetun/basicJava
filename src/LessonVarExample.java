public class LessonVarExample {

    public static void main(String[] args) {

        // Объявляем переменные
        byte x = 25;

        int y = x / 5;

        int z = x + y;

    /*
    Comment1
    Comment2
    Comment3
     */


        double pi = 3.1415;

        double result = x / pi;

        // Переменная может иметь только два значения true или false
        boolean check;

        check = (x == y);

        boolean b1 = true;

        boolean b2 = false;

        System.out.println(b1 & b2);
        System.out.println(b1 || b2);
        System.out.println(!b1);

        System.out.println("X = " + x);
        System.out.println("Result = " + result);
        System.out.println("Check is - " + check);


    }


}
