package sequences;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 10.03.2023 21:58
 */

public class SequencesImpl implements Sequences {

    @Override
    public void a(int n) {
        int first = 2;
        int step = 2;
        int next;

        System.out.print(first);
        for (int i = 1; i < n; i++) {
            next = first += step;
            System.out.print(", " + next);
        }
        System.out.println();
    }

    @Override
    public void b(int n) {
        int first = 1;
        int step = 2;
        int next;

        for (int i = 1; i <= n; i++, first += step) {
            next = first;
            System.out.print(next);

            if (i != n) System.out.print(", ");
            else System.out.println();
        }
    }

    @Override
    public void c(int n) {
        int first = 1;
        int second = 3;
        int step = 2;
        int next;

        System.out.print(first);
        for (int i = 1; i < n; i++, second += step) {
            next = first += second;
            System.out.print(", " + next);
        }
        System.out.println();
    }

    @Override
    public void d(int n) {
        int step = 3;
        int next;

        for (int i = 1; i <= n; i++) {
            next = (int) Math.pow(i, step);
            System.out.print(next);

            if (i != n) System.out.print(", ");
            else System.out.println();
        }
    }

    @Override
    public void e(int n) {
        int next;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                next = -1;
            } else next = 1;

            System.out.print(next);
            if (i != n) System.out.print(", ");
            else System.out.println();
        }
    }

    @Override
    public void f(int n) {
        int next;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) next = i * (-1);
            else next = i;

            System.out.print(next);
            if (i != n) System.out.print(", ");
            else System.out.println();
        }
    }

    @Override
    public void g(int n) {
        boolean flag = true;
        int step = 2;
        int next;

        for (int i = 1; i <= n; i++, flag = !flag) {
            next = (int) Math.pow(i, step);
            if (!flag) next = next * (-1);

            System.out.print(next);
            if (i != n) System.out.print(", ");
            else System.out.println();
        }
    }

    @Override
    public void h(int n) {
        int next;
        int counter = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) next = 0;
            else next = counter++;

            System.out.print(next);
            if (i != n) System.out.print(", ");
            else System.out.println();
        }
    }

    @Override
    public void i(int n) {
        int next = 1;
        for (int i = 1; i <= n; i++) {
            next = next * i;

            System.out.print(next);
            if (i != n) System.out.print(", ");
            else System.out.println();
        }
    }

    @Override
    public void j(int n) {
        int prev1Step = 0;
        int prev2Steps = 0;
        int next = 1;

        for (int i = 1; i <= n; i++) {
            next = next + prev2Steps;
            prev2Steps = prev1Step;
            prev1Step = next;

            System.out.print(next);
            if (i != n) System.out.print(", ");
            else System.out.println();
        }
    }
}