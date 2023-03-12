package accumulator;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 12.03.2023 11:57
 */

public class StatsAccumulatorImpl implements StatsAccumulator {

    private int count = 0;
    private int min = 0;
    private int max = 0;
    private long sum = 0;

    @Override
    public void add(int value) {
        count++;
        sum += value;

        if (value <= min) min = value;
        else if (value > max) max = value;
    }

    @Override
    public int getMin() {
        return min;
    }

    @Override
    public int getMax() {
        return max;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        double result = 0;
        if (count != 0) {
            result = (double) sum / count;
        }
        return Math.round(result * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "count: " + getCount() + ", min: " + getMin() + ", max: " + getMax() + ", avg: " + getAvg();
    }
}