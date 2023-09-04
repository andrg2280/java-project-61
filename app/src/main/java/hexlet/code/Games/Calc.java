package hexlet.code.Games;

import hexlet.code.Engine;

import static hexlet.code.Utils.MAX_COLS;
import static hexlet.code.Utils.MAX_ROWS;
import static hexlet.code.Utils.getRandomNumber;

public class Calc {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_INDEX_NUMBER = 0;
    public static final int MAX_RANDOM_INDEX_NUMBER = 2;
    public static void calculateExpression() {
        String[] sOperators = {"+", "-", "*"};
        String[][] rounds = new String[MAX_ROWS][MAX_COLS];

        for (int i = 0; i < rounds.length; i++) {
            int randomIndex = getRandomNumber(MIN_RANDOM_INDEX_NUMBER, MAX_RANDOM_INDEX_NUMBER);
            int randomNumber1 = getRandomNumber(0, MAX_RANDOM_NUMBER);
            int randomNumber2 = getRandomNumber(0, MAX_RANDOM_NUMBER);
            rounds[i][0] = randomNumber1 + " " + sOperators[randomIndex] + " " + randomNumber2;
            rounds[i][1] = eval(randomNumber1, sOperators[randomIndex], randomNumber2) + "";
        }
        Engine.playRounds("What is the result of the expression?", rounds);
    }
    public static int eval(int a, String operator, int b) {
        int r = 0;
        switch (operator) {
            case "/" -> r += a / b;
            case "*" -> r += a * b;
            case "-" -> r += a - b;
            case "+" -> r += a + b;
            default -> {
            }
        }

        return r;
    }
}
