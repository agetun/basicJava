package lessons.lesson14.lessoncode;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {

        int[] a = new int[2];
        int[] b = new int[2];

        a[0] = 1;
        a[1] = 2;
        b[0] = 3;
        b[1] = 4;

        int[]  c = join(a,b);

        System.out.println(Arrays.toString(c));

    }

    public static int[] join(int[] a, int[] b)
    {
    int[] c = new int[a.length + b.length];

    System.arraycopy(a, 0, c, 0, a.length);
    System.arraycopy(b, 0, c, a.length, b.length);

    return c;
    }
}
