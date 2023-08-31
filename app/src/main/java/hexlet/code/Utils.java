package hexlet.code;

import java.util.Random;

import static java.lang.Math.sqrt;

public class Utils {
    public static final int MAX_COLS = 2;
    public static final int MAX_ROWS = 3;
    public static int eval(int a, String operator, int b) {
        int r = 0;
        switch (operator) {
            case "/":
                r += a / b;
                break;
            case "*":
                r += a * b;
                break;
            case "-":
                r += a - b;
                break;
            case "+":
                r += a + b;
                break;
            default :
                break;
        }

        return r;
    }
    public static int getRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(lowerBound, upperBound);
    }
    public static int gcdBF(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static boolean isPrime(int iInput) {
        if (iInput < 2) {
            return false;
        }
        double d = sqrt(iInput);
        for (int i = 2; i <= d; i++) {
            if (iInput % i == 0) {
                return false;
            }
        }
        return true;
    }
}
