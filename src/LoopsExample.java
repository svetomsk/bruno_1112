public class LoopsExample {
    public static void main(String[] args) {
        // 1 * 2 * 3 * ... * 30
        long current = 1;
        int n = 20;
        for (int i = 2; i <= n ; i++) { // i = i + 1
            current = current * i;
//            current *= i;
//            System.out.println(current);
        }
        System.out.println("Result: " + current);

        String input = "It's just simple input";
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        int k = 3;
        int value = 1;
        for (int i = 0; i < k; i++) {
            value *= n;
        }
        System.out.println(n + "^" + k + " = " + value);

        String isPalindrom = "abcba";
        boolean result = true;
        for (int i = 0; i < isPalindrom.length() / 2; i++) {
            char firstChar = isPalindrom.charAt(i);
            char lastChar = isPalindrom.charAt(isPalindrom.length() - 1 - i);
            if (firstChar != lastChar) {
                result = false;
            }
        }
        System.out.println("Result " + result);
    }
    // "363333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333"
}
