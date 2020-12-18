import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4 ,5};
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // 0 .. n - 1 - i
            for (int j = 0; j < n - 1 - i; j++) {
                // array[j] <= array[j + 1]
//                if (array[j] > array[j + 1]) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int [] secondArr = {1 ,253, 23, 23, 123,1233223231};
        Arrays.sort(secondArr);
        System.out.println(Arrays.toString(secondArr));
    }
}
