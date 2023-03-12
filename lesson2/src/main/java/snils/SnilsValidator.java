package snils;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 11.03.2023 22:44
 */

public interface SnilsValidator {
    int COUNT_DIGITS = 11;
    boolean validate(String snils);
}