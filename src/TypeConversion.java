public class TypeConversion {
    public static void main(String[] args) {
        String number = "12345";
        // int -> Integer
        int intNumber = Integer.parseInt(number);
        System.out.println(intNumber + 10);

        String stringNumber = String.valueOf(intNumber);
        System.out.println(stringNumber.charAt(0));

//        System.out.println(Integer.parseInt("hello, world"));

        byte smallValue = 10; // 8 бит
        int value = 123345; // 32 бит
        long bigValue = 1232100000009L; // 64 бит
        System.out.println(smallValue + " " + value + " " + bigValue);

        // неявное преобразование типов
        bigValue = value;
        bigValue = smallValue;

        // явное преобразование типов
        bigValue = 9999999999999999L;
        value = (int) bigValue; // long -> int
        System.out.println(value);
        System.out.println(bigValue);

        // переполнение
        int maxValue = Integer.MAX_VALUE; // максимальное значение типа int
        System.out.println(maxValue);
        maxValue = maxValue + 1;
        System.out.println(maxValue);
    }
}
