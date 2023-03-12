package sequences;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 10.03.2023 22:11
 */

public class SequencesTest {
    public static void main(String[] args) {

        Sequences sequencesGenerator = new SequencesImpl();
        int n = 5;

        sequencesGenerator.a(n);
        sequencesGenerator.b(n);
        sequencesGenerator.c(n);
        sequencesGenerator.d(n);
        sequencesGenerator.e(n);
        sequencesGenerator.f(n);
        sequencesGenerator.g(n);
        sequencesGenerator.h(n);
        sequencesGenerator.i(n);
        sequencesGenerator.j(n);
    }
}
