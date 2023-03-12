package snils;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 11.03.2023 22:48
 */

public class SnilsValidatorImpl implements SnilsValidator {

    private String parse(String snils) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < snils.trim().length(); i++) {
            char ch = snils.charAt(i);
            boolean isDigit = Character.isDigit(ch);

            if (isDigit) {
                if (sb.length() == COUNT_DIGITS) {
                    System.out.printf("Количество введенных цифр больше %d! Последние (лишние) исключены!\n", COUNT_DIGITS);
                    break;
                }
                int x = Character.digit(ch, 10);
                sb.append(x);
            }
        }
        return sb.toString();
    }

    @Override
    public boolean validate(String snils) {
        int countDigits = 9;
        int sumMultiDigits = 0;
        int counterDigits = 0;
        int sumCheck;

        // парсинг строки со СНИЛСом и проверка на количество переданных цифр
        String strDigits = parse(snils);
        if (strDigits.length() != COUNT_DIGITS) {
            System.out.printf("Количество введенных цифр должно быть %d!\n", COUNT_DIGITS);
            return false;
        }

        // выделение первых 9 и последних 2 цифр из строки СНИЛСа
        String nineFirstDigits = strDigits.substring(0, countDigits);
        String twoLastDigits = strDigits.substring(countDigits);

        // формирование массива чисел из строки с 9 цифрами
        int[] digits = new int[countDigits];
        for (int i = 0; i < countDigits; i++) {
            digits[i] = Character.digit(nineFirstDigits.charAt(i), 10);
        }

        // расчет суммы произведений
        for (int j = countDigits; j > 0; j--, counterDigits++) {
            sumMultiDigits = sumMultiDigits + j * digits[counterDigits];
        }

        // проверка суммы и расчет остатка от нее, согласно алгоритма
        if (sumMultiDigits < 100) {
            sumCheck = sumMultiDigits;
        } else if (sumMultiDigits == 100) {
            sumCheck = 0;
        } else {
            sumCheck = sumMultiDigits % 101;
            if (sumCheck == 100) {
                sumCheck = 0;
            }
        }

        // сравнение и возврат результата
        String strCheck;
        if (sumCheck == 0) strCheck = "00";
        else strCheck = Integer.toString(sumCheck);

        return strCheck.equals(twoLastDigits);
    }
}