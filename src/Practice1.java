public class Practice1 {
    // psvm
    public static void main(String[] args) {
        // проверка на четность
        int value = 124;
        int reminder = value % 2;
        if (reminder == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        // проверка на делимость
        int first = 125;
        int second = 4;
        reminder = first % second;
        if (reminder == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No, reminder "  + reminder);
        }

        // найти "среднее число"
        int a = 3;
        int b = 40;
        int c = 20;
        if (a >= c && a <= b || a <= c && a >= b) {
            System.out.println(a);
        } else if (b >=a && b <= c || b <= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        if (a >= b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b >= c) {
            int tmp = b;
            b = c;
            c = tmp;
        }
        if (a >= b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(b);

        System.out.println(c - a);
    }
}
