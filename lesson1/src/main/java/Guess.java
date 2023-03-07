import java.util.Random;
import java.util.Scanner;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 04.03.2023 19:41
 */

public class Guess {
    public static void main(String[] args) {
        int number = new Random().nextInt(99) + 1; // здесь загадывается число от 1 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        Scanner in = new Scanner(System.in);

        System.out.println("Я загадал число от 1 до 99. У тебя " + maxAttempts + " попыток угадать.");
        System.out.println("Введите число:");

        for (int i = 1; i <= maxAttempts; i++) {

            System.out.print("-> ");
            int numberIn = in.nextInt();

            if (numberIn <= 0 || numberIn > 99) {
                System.out.printf("Ошибка ввода! У тебя осталось %d попыток\n", maxAttempts - i);
            } else if (numberIn > number) {
                System.out.printf("Мое число меньше! У тебя осталось %d попыток\n", maxAttempts - i);
            } else if (numberIn < number) {
                System.out.printf("Мое число больше! У тебя осталось %d попыток\n", maxAttempts - i);
            } else {
                System.out.printf("Ты угадал с %d попытки\n", i);
                return;
            }

            if (i == maxAttempts) {
                System.out.println("Ты не угадал!");
            }
        }
    }
}
