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

            while (flag) {
                int n = in.nextInt();

                if (n < 0 || n > 30) {
                    System.err.println("Ошибка ввода!");
                    continue;
                }

                System.out.println("Вывод:");
                switch (n) {
                    case 0 -> System.out.println("0");
                    case 1 -> System.out.println("1");
                    default -> {
                        long result = Math.round(2 * funPell(n - 1) + funPell(n - 2));
                        System.out.println(result);
                    }
                }
                flag = false;
            }
        }
    }

    static double funPell(int n) {
        double sqrtTwo = Math.sqrt(2);
        double arg1 = Math.pow((1 + sqrtTwo), n);
        double arg2 = Math.pow((1 - sqrtTwo), n);
        return (arg1 - arg2) / (2 * sqrtTwo);
    }
}