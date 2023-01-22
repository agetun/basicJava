package lessons.lesson14.lessoncode;

import java.util.Arrays;

public class LessonTask2Util {


    public int inputData(String input){

        if (input.equals("from")) {
            return 0;
        }
        if (input.equals("to")) {
            return 9;
        }
        if (input.equals("size")) {
            return 15;
        }

        return 0;
    }


    public int[] createArray(int size){
        int[] createdArray =  new int [size];
        return createdArray;
    }

    public int randomValue(int fromNumber, int toNumber){
        int pseudoRandomValue = (int) (Math.random()*(toNumber-fromNumber+1)+fromNumber);
        return pseudoRandomValue;
    }
    public void fillArray(int[] arrayForFilling,int fromNumber, int toNumber ){

        for (int i = 0; i < arrayForFilling.length ; i++) {
            arrayForFilling[i] = randomValue(fromNumber,toNumber);
        }
    }

    public int counterElements(int[] arrayForCounting){
        int counter=0;

        for (int i = 0; i < arrayForCounting.length; i++) {
            if (arrayForCounting[i]%2 == 0){
                counter++;
            }
        }

        return counter;
    }

    public void printArray(int[] arrayForPrinting, String message){

        System.out.println(Arrays.toString(arrayForPrinting));
            System.out.print(message);

    }

}
