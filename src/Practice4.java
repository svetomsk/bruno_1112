public class Practice4 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 10};
        boolean result = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                result = false;
            }
        }
        System.out.println("Отсортирован: " + result);
    }
}
