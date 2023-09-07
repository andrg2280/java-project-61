package hexlet.code.Games;

import hexlet.code.Engine;

import static hexlet.code.Utils.MAX_COLS;
import static hexlet.code.Utils.MAX_ROWS;
import hexlet.code.Utils;

public class Calc {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_INDEX_NUMBER = 0;
    public static final int MAX_RANDOM_INDEX_NUMBER = 2;
    public static void calculateExpression() throws Exception {
        String[] operators = {"+", "-", "*"};
        String[][] rounds = new String[MAX_ROWS][MAX_COLS];

        for (int i = 0; i < rounds.length; i++) {
            int randomIndex = Utils.getRandomNumber(MIN_RANDOM_INDEX_NUMBER, MAX_RANDOM_INDEX_NUMBER);
            int randomNumber1 = Utils.getRandomNumber(0, MAX_RANDOM_NUMBER);
            int randomNumber2 = Utils.getRandomNumber(0, MAX_RANDOM_NUMBER);
            rounds[i][0] = randomNumber1 + " " + operators[randomIndex] + " " + randomNumber2;
            rounds[i][1] = Integer.toString(eval(randomNumber1, operators[randomIndex], randomNumber2));
        }
        Engine.playRounds("What is the result of the expression?", rounds);
    }
    public static int eval(int a, String operator, int b) throws Exception {
        switch (operator) {
            case "*" -> {
                return a * b;
            }
            case "-" -> {
                return a - b;
            }
            case "+" -> {
                return a + b;
            }
            default -> {
                throw new Exception("Invalid operator '" + operator + "'");
            }
        }
    }
}
