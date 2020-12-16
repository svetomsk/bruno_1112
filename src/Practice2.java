import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        String input = "asdfsdfdsfsdfррр";
        boolean result = true;
        boolean alternative = true;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol > 'z' || symbol < 'a') {
                result = false;
            }

//            if (!Character.isLowerCase(symbol)) {
            if (Character.isLowerCase(symbol) == false) {
                alternative = false;
            }
        }
        System.out.println("Result: " + result);
        System.out.println("Another result: " + alternative);


        int n = 123456789;
        int sumOfDigits = 0;
        for (int i = n; i > 0; i = i / 10) {
            sumOfDigits = sumOfDigits + i % 10;
        }
        System.out.println("Sum of digits = " + sumOfDigits);

        System.out.println((int)'0');
        System.out.println((int)'1');
        System.out.println((int)'2');
        System.out.println((int)'3');
        System.out.println((int)'4');

        char digit = '4';
        int number = digit - '0';
        System.out.println(number);
        System.out.println(Character.digit(digit, 10));

        Scanner scanner = new Scanner(System.in);
//        for (;;) {
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.length() == 0) {
                break;
            }
            System.out.println(userInput);
        }
//        do {
//
//        } while(true);
    }
}
