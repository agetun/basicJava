package homework.lesson13Arrays;

public class Arrays2HW {

    public static void main(String[] args) {

        int[] arrays1 = new int[5];

        for (int i = 0; i < arrays1.length; i++) {
            arrays1[i] = (int) (Math.random() * 90) + 10;
            System.out.print(arrays1[i] + "  ");
        }

        boolean flag = true;
        for (int i = 1; i < arrays1.length; i++) {
            if (arrays1[i] <= arrays1[i-1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("\nArray up numbers");
        } else {
            System.out.println("\nArray not up numbers");
        }
}

}