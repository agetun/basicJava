package lessons.lesson7;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */

public class LessonCode1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your figure - ");
        int userInput = scanner.nextInt();

        //int userInput = 0b0011;
        System.out.println(userInput);


        if (userInput<0) {
            System.out.println("Your figure is negative!");
        } else if (userInput>0) {
            System.out.println("Your figure is positive!");
        } else if (userInput==0){
            System.out.println("Your figure is 0");
        } else {
            System.out.println("How is it possible?");
        }



    }

}
