package homework.lesson13Arrays;

public class Arrays2HW {

    public static void main(String[] args) {

        int[] arrays1 = new int[5];

        for (int i = 0; i < arrays1.length; i++) {
            arrays1[i] = (int) (Math.random() * 98) + 10;
            System.out.print(arrays1[i] + "  ");
        }
}

}