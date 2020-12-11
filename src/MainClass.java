public class MainClass {
//    psvm
    public static void main(String[] args) {
//        sout
        System.out.println("Hello, world!");
        int justNumber;
        int firstNumber = 110; // создание переменной
        int secondNumber = 45;
        System.out.println("Первое число: " + firstNumber);
        System.out.println("Второе число: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Сумма: " + sum);
        System.out.println(150 + 100 - 50 * 2 + 6 / 2);
        System.out.println(123 % 2);

        firstNumber = 4321;
        System.out.println(firstNumber + secondNumber);
        justNumber = 123;
        // sum of digits
        int sumOfDigits = 0;

        //
        int n = 10;
        int result = n * (n + 1) / 2;
        System.out.println("Сумма от 1 до " + n + " = " + result);
    }
}
