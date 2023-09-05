package hexlet.code.Games;


import static hexlet.code.Engine.playRounds;
import static hexlet.code.Utils.MAX_COLS;
import static hexlet.code.Utils.MAX_ROWS;
import static hexlet.code.Utils.getRandomNumber;
import static java.lang.Math.sqrt;

public class Prime {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static void calculatePrimeNumber() {
        int  randomNumber = 0;
        String[][] rounds = new String[MAX_ROWS][MAX_COLS];

        for (int i = 0; i < rounds.length; i++) {
            randomNumber = getRandomNumber(0, MAX_RANDOM_NUMBER);
            rounds[i][0] = randomNumber + "";
            if (isPrime(randomNumber)) {
                rounds[i][1] = "yes";
            } else {
                rounds[i][1] = "no";
            }
        }
        playRounds("Answer 'yes' if given number is prime. Otherwise answer 'no'.", rounds);
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
