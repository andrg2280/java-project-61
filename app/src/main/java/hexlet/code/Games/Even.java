package hexlet.code.Games;

import static hexlet.code.Engine.playRounds;
import static hexlet.code.Utils.getRandomNumber;
import static hexlet.code.Utils.MAX_COLS;
import static hexlet.code.Utils.MAX_ROWS;

public class Even {
    public static final int MAX_RANDOM_NUMBER = 100;

    public static void calculateEvenNumber() {
        String[][] rounds = new String[MAX_ROWS][MAX_COLS];

        for (int i = 0; i < rounds.length; i++) {
            int randomNumber = getRandomNumber(0, MAX_RANDOM_NUMBER);
            rounds[i][0] = randomNumber + "";
            rounds[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        playRounds("Answer 'yes' if the number is calculateEvenNumber, otherwise answer 'no'.", rounds);
    }
}
