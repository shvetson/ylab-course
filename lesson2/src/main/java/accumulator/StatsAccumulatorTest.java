package accumulator;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 12.03.2023 22:03
 */

public class StatsAccumulatorTest {
    // задан диапазон положительных чисел, который можно скорректировать
    static int MIN_VALUE = -10;
    static int MAX_VALUE = 10;

    public static void main(String[] args) {
        StatsAccumulator accumulator = new StatsAccumulatorImpl();

        // Добавление n=10 чисел
        int n = 10;
        for (int i = 0; i < n; i++) {
            // выборка цифр от MIN_VALUE до MAX_VALUE включительно
            int k = MAX_VALUE - MIN_VALUE + 1;
            int value = (int) (Math.random() * k + MIN_VALUE);
            // вывод случайно выбранных чисел
            System.out.printf(value + " ");
            accumulator.add(value);
        }

        System.out.println();
        System.out.println("\n" + accumulator);
        System.out.println();
        System.out.println("count: " + accumulator.getCount());
        System.out.println("min:   " + accumulator.getMin());
        System.out.println("max:   " + accumulator.getMax());
        System.out.println("avg:   " + accumulator.getAvg());
    }
}
