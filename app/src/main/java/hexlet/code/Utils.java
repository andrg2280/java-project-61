package hexlet.code;

import java.util.Random;
public class Utils {
    public static final int MAX_COLS = 2;
    public static final int MAX_ROWS = 3;

    public static int getRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(lowerBound, upperBound);
    }
}
