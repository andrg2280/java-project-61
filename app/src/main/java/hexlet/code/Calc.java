package hexlet.code;

import static hexlet.code.Engine.checkAnswer;
import static hexlet.code.Utils.MAX_ROWS;
import static hexlet.code.Utils.MAX_COLS;
import static hexlet.code.Utils.getRandomNumber;

public class Calc {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_INDEX_NUMBER = 0;
    public static final int MAX_RANDOM_INDEX_NUMBER = 2;
    public static void calc() {
        String[] sSigns = {"+", "-", "*"};
        int randomNumber1 = 0;
        int randomIndex = 0;
        int randomNumber2 = 0;
        int correctAnswer = 0;
        String[][] rounds = new String[MAX_ROWS][MAX_COLS];

        for (int i = 0; i < rounds.length; i++) {
            randomIndex = getRandomNumber(MIN_RANDOM_INDEX_NUMBER, MAX_RANDOM_INDEX_NUMBER);
            randomNumber1 = getRandomNumber(0, MAX_RANDOM_NUMBER);
            randomNumber2 = getRandomNumber(0, MAX_RANDOM_NUMBER);
            rounds[i][0] = randomNumber1 + " " + sSigns[randomIndex] + " " + randomNumber2;
            rounds[i][1] = Utils.eval(randomNumber1, sSigns[randomIndex], randomNumber2) + "";
        }
        checkAnswer("What is the result of the expression?", rounds);
    }
}
