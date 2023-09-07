package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playRounds(String rules, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);
            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            String correctAnswer = round[1];
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println(
                        "'" + userAnswer + "' is wrong answer ;(. "
                                + "Correct answer was '" + correctAnswer + "'."
                );
                System.out.println("Let's try again, " + userName + "!");
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        if (rounds.length > 0) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
