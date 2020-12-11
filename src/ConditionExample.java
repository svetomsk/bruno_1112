public class ConditionExample {
    public static void main(String[] args) {
        int a = 14;
        int b = 55;
        boolean resultOfCompare = a > b;
        System.out.println(resultOfCompare);
        if (resultOfCompare) { // если a больше b
            // блок выполняется, если условие верно
            System.out.println(a);
        } else { // иначе
            System.out.println(b);
        }

        int x = -19;
        if (x < -10) {
            System.out.println("Left");
        } else if (x >= 10) {
            System.out.println("Right");
        } else {
            System.out.println("Center");
        }

        if (x >= -10 && x < 10) { // X больше -10 И X меньше 10
            System.out.println("Center");
        }

        if (x < -10 || x > 10) { // X меньше -10 ИЛИ X больше 10
            System.out.println("Not in center");
        }


    }
}
