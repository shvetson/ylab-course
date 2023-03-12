package printer;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 12.03.2023 21:53
 */

public class RateLimitedPrinterTest {

    public static void main(String[] args) {
        int tm = 1000;
        RateLimitedPrinter rateLimitedPrinter = new RateLimitedPrinter(tm);
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000_000; i++) {
            rateLimitedPrinter.print(String.valueOf(i));
        }

        System.out.printf("\nПродолжительность: %d сек.", (System.currentTimeMillis() - start) / 1000);
    }
}
