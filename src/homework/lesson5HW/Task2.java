package homework.lesson5HW;

public class Task2 {

    public static void main(String[] args) {

        String text = "I study Basic Java!";

        StringMethodsTest(text);

    }

    public static void StringMethodsTest(String text){

        String str1 = new String(text);
        System.out.println(text);

        char simbol = text.charAt(18);

        System.out.println(simbol);

        System.out.println(text.contains("Java"));


//Остальное не успеваю разобраться как осуществить замену символов,
// преобразовать в верхний и нижний регистры, вырезать строку.




    }

}
