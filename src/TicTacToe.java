import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static int sum(int a, int b) {
        return a + b;
    }

    static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    static String checkAllDirections(String [][] field, int n) {
        String checkResult = ""; // "__________0__"
        for (int i = 0; i < n; i++) {
            // проверка строк на выигрыш
            String currentRow = field[i][0] + field[i][1] + field[i][2];
            checkResult += checkWinning(currentRow);

            // проверка столбцов на выигрыш
            String currentColumn = field[0][i] + field[1][i] + field[2][i];
            checkResult += checkWinning(currentColumn);
        }
        // главная диагональ
        String mainDiag = field[0][0] + field[1][1] + field[2][2];
        checkResult += checkWinning(mainDiag);

        // побочная диагональ
        String oppositDiag = field[0][2] + field[1][1] + field[2][0];
        checkResult += checkWinning(oppositDiag);
        System.out.println("Results : " + checkResult);

        return checkResult;
    }

    static String checkWinning(String value) {
        String result = "_";
        if (value.equals("XXX") || value.equals("000")) {
            result = value.charAt(0) + "";
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] field = {
                {"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}
        };
        int n = field.length;
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(field[i]));
        }

        Scanner scanner = new Scanner(System.in);
        boolean isFirstPlayer = true;
        main_loop:
        while (true) {
            if (isFirstPlayer) {
                System.out.println("Ходит крестик");
            } else {
                System.out.println("Ходит нолик");
            }
            System.out.print("Введите ваш ход: ");
            int row = scanner.nextInt();
            int column = scanner.nextInt();

            // выход за границы поля
            if (row < 0 || row >= n || column < 0 || column >= n) {
                System.err.println("Некорретные данные");
                continue;
            }
            // ячейка занята
            if (field[row][column].equals("_") == false) {
                System.err.println("Ячейка уже занята");
                continue;
            }

            if (isFirstPlayer)
                field[row][column] = "X";
            else
                field[row][column] = "0";

            String checkResult = checkAllDirections(field, n);
            if (checkResult.contains("X")) {
                System.out.println("Победил X");
                break main_loop;
            }
            if (checkResult.contains("0")) {
                System.out.println("Победил 0");
                break main_loop;
            }

            isFirstPlayer = !isFirstPlayer;

            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(field[i]));
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
    }
}
