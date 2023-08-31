package hexlet.code;


import static hexlet.code.Engine.checkAnswer;
import static hexlet.code.Utils.MAX_COLS;
import static hexlet.code.Utils.MAX_ROWS;
import static hexlet.code.Utils.getRandomNumber;

public class Prog {
    public static final int PROGRESSION_LENGTH = 11;
    public static final int MIN_RANDOM_NUMBER = 9;
    public static final int MAX_RANDOM_NUMBER = 10;
    public static void prog() {
        int randomNumber1 = 0;
        int randomNumber2 = 0;
        int numberVoided = 0;
        String[][] rounds = new String[MAX_ROWS][MAX_COLS];

        for (int i = 0; i < rounds.length; i++) {
            randomNumber1 = getRandomNumber(0, MAX_RANDOM_NUMBER);
            randomNumber2 = getRandomNumber(0, MIN_RANDOM_NUMBER);
            String sProgress = "";
            for (int j = 1; j < PROGRESSION_LENGTH; j++) {
                if (randomNumber2 == (j - 1)) {
                    sProgress = sProgress.trim() + " .. ";
                    numberVoided = (j * randomNumber1);
                } else {
                    sProgress = sProgress + (j * randomNumber1) + " ";
                }
            }
            rounds[i][0] = sProgress.trim();
            rounds[i][1] = numberVoided + "";
        }
        checkAnswer("What number is missing in the progression?", rounds);
    }
}
