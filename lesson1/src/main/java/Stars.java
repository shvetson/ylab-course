import java.util.Scanner;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 04.03.2023 18:02
 */

public class Stars {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Ввод:");

            System.out.print("Количество строк: ");
            int countRows = in.nextInt();
            System.out.print("Количество столбцов: ");
            int countCols = in.nextInt();
            System.out.print("Символ: ");
            String symbol = in.next();

            System.out.println("\nВывод:");
            for (int i = 0; i < countRows; i++) {
                for (int j = 0; j < countCols; j++) {
                    System.out.print(symbol);
                }
                System.out.print("\n");
            }
        }
    }
}
