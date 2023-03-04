/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 04.03.2023 18:08
 */

public class MultTable {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;

        System.out.println("Вывод:");

        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }

            if (i != b) {
                System.out.println("----------");
            }
        }
    }
}
