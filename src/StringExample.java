public class StringExample {
    public static void main(String[] args) {
        String firstName = "Svetozar";
        String lastName = "Ivanov";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        int firstNameLength = firstName.length(); // длина строки
        System.out.println("First name length: " + firstNameLength);
        System.out.println(fullName.length());

        char symbol = fullName.charAt(0);
        System.out.println("First symbol: " + symbol);

        char lastSymbol = fullName.charAt(fullName.length() - 1);
        System.out.println("Last symbol: " + lastSymbol);
    }
}
