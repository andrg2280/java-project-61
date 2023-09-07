package hexlet.code.Games;


import hexlet.code.Engine;
import static hexlet.code.Utils.MAX_COLS;
import static hexlet.code.Utils.MAX_ROWS;
import hexlet.code.Utils;

public class Prog {
    public static final int PROGRESSION_LENGTH = 11;
    public static final int MIN_RANDOM_NUMBER = 9;
    public static final int MAX_RANDOM_NUMBER = 10;
    static int voidNumber = 0;
    public static void calculateMissingDigit() {
        String[][] rounds = new String[MAX_ROWS][MAX_COLS];
        for (int i = 0; i < rounds.length; i++) {
            int randomIndex = Utils.getRandomNumber(1, MIN_RANDOM_NUMBER);
            String[] progression = formProgression();
            rounds[i][1] = progression[randomIndex];
            progression[randomIndex] = "..";
            rounds[i][0] = String.join(" ", progression);
        }
        Engine.playRounds("What number is missing in the progression?", rounds);
    }
    static String[] formProgression() {
        int randomNumber1 = Utils.getRandomNumber(2, MAX_RANDOM_NUMBER);
        String[] progression = new String[PROGRESSION_LENGTH - 1];
        for (int j = 1; j < PROGRESSION_LENGTH; j++) {
            progression[j - 1] = Integer.toString((j * randomNumber1));
        }
        return progression;
    }
}
