package lessons.lesson13;

import java.util.Arrays;

public class CreatArrayExample1 {

    public static void main(String[] args) {

        int[][] array1 = new int[3][4];

        int[][] array2 = new int[3][];

        array2[0] = new int[]{1, 2, 3, 4, 5};
        array2[1] = new int[]{6, 7};
        array2[2] = new int[]{8, 9, 10};

        System.out.println(Arrays.deepToString(array2));

        for (int i = 0; i < array2.length; i++) {
            System.out.println();
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print(" " + array2[i][j] + " ");
        }
    }

    }
}
