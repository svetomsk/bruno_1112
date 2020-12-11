import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String userInput = scanner.next(); // считать следующее слово
//        String userInput = scanner.nextLine(); // считать следующее слово
        System.out.println("Привет, " + userInput + "!");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
