package lessons.lesson14.lessoncode;

public class LessonTask1Util {


    public int inputData(String input){

        if (input.equals("from")) {
            return 1;
        }
        if (input.equals("to")) {
            return 99;
        }
        return 0;
    }


    public int detectArraySize(int fromNumber, int toNumber){
    int arraySize = (toNumber-fromNumber)/2+1;
    return arraySize;
    }

    public int[] createArray(int size){
        int[] createdArray =  new int [size];
        return createdArray;
    }

    public void fillArray(int[] arrayForFilling,int fromNumber, int toNumber ){

        int counter = 0;

        for (int i = fromNumber; i <= toNumber ; i++) {

            if (i%2 != 0) {
            arrayForFilling[counter]=i;
            counter++;}

        }
    }

    public void printArray(int[] arrayForFilling){
        for (int i = arrayForFilling.length-1; i >= 0 ; i--) {

            System.out.print(arrayForFilling[i]+",");
        }
    }

}
