import java.util.Scanner;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 04.03.2023 18:24
 */

public class Pell {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Ввод:");
            boolean flag = true;
            int n = 0;

            while (flag) {
                System.out.print("-> ");
                n = in.nextInt();

                if (n < 0 || n > 30) {
                    System.out.println("Ошибка ввода!");
                    continue;
                }
                flag = false;
            }

            long result = 0;
            for (int i = 0; i <=n; i++) {
                long res = pell(i);
                System.out.print(res + " ");
                if (i == n) {
                    result = res;
                }
            }

            System.out.println("\nВывод:");
            System.out.println(result);
        }
    }

    static long pell(int n) {
        if (n < 3) return n;
        return 2 * pell(n - 1) + pell(n - 2);
    }
}