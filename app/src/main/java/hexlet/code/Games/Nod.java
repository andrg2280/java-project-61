package hexlet.code.Games;

import static hexlet.code.Engine.playRounds;
import static hexlet.code.Utils.MAX_COLS;
import static hexlet.code.Utils.MAX_ROWS;
import static hexlet.code.Utils.getRandomNumber;

public class Nod {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static void calculateGCD() {
        int randomNumber1 = 0;
        int randomNumber2 = 0;
        String[][] rounds = new String[MAX_ROWS][MAX_COLS];

        for (int i = 0; i < rounds.length; i++) {
            randomNumber1 = getRandomNumber(0, MAX_RANDOM_NUMBER);
            randomNumber2 = getRandomNumber(0, MAX_RANDOM_NUMBER);
            rounds[i][0] = randomNumber1 + " " + randomNumber2;
            rounds[i][1] = gcdBF(randomNumber1, randomNumber2) + "";
        }
        playRounds("Find the greatest common divisor of given numbers.", rounds);
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
}
