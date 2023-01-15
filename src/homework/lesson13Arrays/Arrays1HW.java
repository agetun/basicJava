package homework.lesson13Arrays;

public class Arrays1HW {

    public static void main(String[] args) {

        int[] arrays = new int[8];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 50) + 1;
            System.out.print(arrays[i] + "  ");
        }

        System.out.println("\nChange second index on 0");

        for (int i = 0; i < arrays.length; i++) {
            if (i%2 == 1) {
                arrays[i] = 0;
            }
            System.out.print(arrays[i] + "  ");
        }

    }
}
