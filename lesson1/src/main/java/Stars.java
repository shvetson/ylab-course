import java.util.Scanner;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 04.03.2023 18:02
 */

public class Stars {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Ввод (количество строк, количество столбцов, символ):");
            String[] arrayArgs = new String[3];
            boolean flag = true;

            while (flag) {
                String cmdLine = in.nextLine();
                arrayArgs = cmdLine.split(" ");

                if (arrayArgs.length != 3) {
                    System.err.println("Некорректный ввод, должно быть - три аргумента через пробел!");
                    continue;
                }
                flag = false;
            }

            int countRows = Integer.parseInt(arrayArgs[0]);
            int countCols = Integer.parseInt(arrayArgs[1]);
            String symbol = arrayArgs[2];

            System.out.println("Вывод:");
            for (int i = 0; i < countRows; i++) {
                for (int j = 0; j < countCols; j++) {
                    System.out.print(symbol);
                }
                System.out.print("\n");
            }
        }
    }
}
