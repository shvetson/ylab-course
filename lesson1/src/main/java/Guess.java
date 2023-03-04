import java.util.Random;
import java.util.Scanner;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 04.03.2023 19:41
 */

public class Guess {
    static boolean flag = true;
    static int counter;

    public static void main(String[] args) {
        int number = new Random().nextInt(99) + 1; // здесь загадывается число от 1 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        counter = maxAttempts;
        Scanner in = new Scanner(System.in);

        System.out.println("Я загадал число от 1 до 99. У тебя " + maxAttempts + " попыток угадать.");
        System.out.println("Введите число:");

        while (flag) {
            System.out.print("-> ");
            int numberIn = in.nextInt();
            counter--;

            if (numberIn <= 0 || numberIn > 99) {
                System.out.printf("Ошибка ввода! У тебя осталось %d попыток\n", counter);
                checkCounter();
                continue;
            }

            if (numberIn == number) {
                System.out.printf("Ты угадал с %d попытки\n", maxAttempts - counter);
                flag = false;
                continue;
            } else if (numberIn > number) {
                System.out.printf("Мое число меньше! У тебя осталось %d попыток\n", counter);
            } else {
                System.out.printf("Мое число больше! У тебя осталось %d попыток\n", counter);
            }

            checkCounter();
        }
    }

    static void checkCounter() {
        if (counter == 0) {
            System.out.println("Ты не угадал");
            flag = false;
        }
    }
}
