package snils;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 12.03.2023 21:58
 */

public class SnilsValidatorTest {
    public static void main(String[] args) {
        SnilsValidator snils = new SnilsValidatorImpl();
        String str;
        boolean result;

        str = "90114404441";
        result = snils.validate(str);
        System.out.println(result);

        str = "01468870570";
        result = snils.validate(str);
        System.out.println(result);
    }
}