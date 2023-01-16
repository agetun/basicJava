package homework.lesson14HW;

import java.util.Arrays;

public class ArrayTask {

    public static void main(String[] args) {

        String[] stringArray= new String[5];

        stringArray[0] = "1";
        stringArray[1] = "2";
        stringArray[2] = "3";
        stringArray[3] = "4";
        stringArray[4] = "5";

        System.out.println(Arrays.toString(stringArray));

        String[] stringArray01 = Arrays.copyOfRange(stringArray,0,2);

        System.out.println(Arrays.toString(stringArray01));

        String[] stringArray34 = Arrays.copyOfRange(stringArray,3,5);

        System.out.println(Arrays.toString(stringArray34));
    }
}
