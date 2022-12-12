package lesson3;

public class Lesson3 {

    public static void main(String[] args) {


        int a1 = 10;
        int b1 = 15;

        int a2 = 100;
        int b2 = 150;

        int a3 = 10;
        int b3 = 15;

        int a4 = 10;
        int b4 = 15;

        int a5 = 10;
        int b5 = 15;

//        int result = a1+b1;
//        System.out.println("result - " + result);

        int result1 = sum(a1,b1);
        int result2 = sum(a2,b2);
        int result3 = sum(a3,b3);
        int result4 = sum(a4,b4);
        int result5 = sum(a5,b5);

        printText(1, result1);

    }

    public static int sum (int x, int y) {
        int sum = x+y;
        return sum;

    }

    public static void printText (int i, int text) {
        System.out.println("Result sum " + i +  " = " + text);

    }
}
