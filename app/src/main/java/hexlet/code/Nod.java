package hexlet.code;

import static hexlet.code.Engine.checkAnswer;
import static hexlet.code.Utils.MAX_COLS;
import static hexlet.code.Utils.MAX_ROWS;
import static hexlet.code.Utils.getRandomNumber;
import static hexlet.code.Utils.gcdBF;

public class Nod {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static void nod() {
        int randomNumber1 = 0;
        int randomNumber2 = 0;
        String[][] rounds = new String[MAX_ROWS][MAX_COLS];

        for (int i = 0; i < rounds.length; i++) {
            randomNumber1 = getRandomNumber(0, MAX_RANDOM_NUMBER);
            randomNumber2 = getRandomNumber(0, MAX_RANDOM_NUMBER);
            rounds[i][0] = randomNumber1 + " " + randomNumber2;
            rounds[i][1] = gcdBF(randomNumber1, randomNumber2) + "";
        }
        checkAnswer("Find the greatest common divisor of given numbers.", rounds);
    }

}
