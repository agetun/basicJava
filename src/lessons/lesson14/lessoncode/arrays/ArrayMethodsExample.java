package lessons.lesson14.lessoncode.arrays;

import java.util.Arrays;

public class ArrayMethodsExample {

    public static void main(String[] args) {

        int[] workingArray= new int[3];

        workingArray[0] = 1;
        workingArray[1] = 2;
        workingArray[2] = 3;

        System.out.println(Arrays.toString(workingArray));



        int [] cloneArray = workingArray.clone();

        workingArray[2]=5;

        System.out.println(Arrays.toString(workingArray));

        System.out.println(Arrays.toString(cloneArray));

        System.out.println("-----------------");

        String[] stringArray= new String[5];

        stringArray[0] = "1";
        stringArray[1] = "2";
        stringArray[2] = "3";
        stringArray[3] = "4";
        stringArray[4] = "5";

        System.out.println(Arrays.toString(stringArray));



        String [] cloneStringArray = stringArray.clone();



        System.out.println(Arrays.toString(stringArray));

        System.out.println(Arrays.toString(cloneStringArray));

        cloneStringArray[2]="5";

        System.out.println(Arrays.toString(stringArray));

        System.out.println(Arrays.toString(cloneStringArray));


        System.out.println("-----------------");

        String[] newArrayForCopy;

        newArrayForCopy = Arrays.copyOf(stringArray,8);

        System.out.println(Arrays.toString(newArrayForCopy));

        String[] newArrayForRangeCopy = Arrays.copyOfRange(stringArray,3,5);

        System.out.println(Arrays.toString(newArrayForRangeCopy));

    }
}
