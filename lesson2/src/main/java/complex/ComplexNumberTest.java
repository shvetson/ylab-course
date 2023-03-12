package complex;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 12.03.2023 21:49
 */

public class ComplexNumberTest {

    public static void main(String[] args) {
        ComplexNumber complexA = new ComplexNumber(12, -3.5);

        ComplexNumber complexB = new ComplexNumber();
        complexB.setRe(23);
        complexB.setIm(10);

        System.out.println(complexA.plus(complexB));
        System.out.println(complexA.minus(complexB));
        System.out.println(complexA.multi(complexB));
        System.out.println(complexA.mod());
    }
}
