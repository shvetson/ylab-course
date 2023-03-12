package printer;

/**
 * @author Oleg Shvets
 * @version 1.0
 * @date 11.03.2023 22:06
 */

public class RateLimitedPrinter {

    private int interval;
    private long lastPrintTime;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
        this.lastPrintTime = System.currentTimeMillis();
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void print(String message) {
        long currentTime = System.currentTimeMillis();

        if ((currentTime - this.lastPrintTime) > getInterval()) {
            System.out.println(message);
            this.lastPrintTime = currentTime;
        }
    }
}