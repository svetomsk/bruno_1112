import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        int b = 0;
        b = 123;

        int[] array = new int[5];
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[3]);
        array[0] = 123;
        array[1] = 230;
        array[2] = array[0] + array[1];
        System.out.println(array[2]);

        System.out.println(array);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            System.out.print(value + " ");
        }
        System.out.println();

        // for-each
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        int [] a = {4, 23, 12, 3};

        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
           a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
    }
}
