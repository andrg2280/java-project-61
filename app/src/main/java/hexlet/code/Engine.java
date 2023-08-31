package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int MAX_PROMPT_NUMBER = 3;
    public static void checkAnswer(String rules, String[][] rounds) {
        String userName = "";
        String userAnswer = "";
        String correctAnswer = "";
        boolean isAnswerCorrect = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        if (rounds.length == 0) {
            System.exit(0);
        } else {
            System.out.println(rules);
        }
        for (int i = 0; i < MAX_PROMPT_NUMBER; i++) {
            System.out.println("Question: " + rounds[i][0]);
            userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            correctAnswer = rounds[i][1];
            isAnswerCorrect = userAnswer.equals(correctAnswer);
            if (isAnswerCorrect) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                i = MAX_PROMPT_NUMBER;
            }
        }
        if (isAnswerCorrect) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
