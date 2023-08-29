package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_INDEX_NUMBER = 0;
    public static final int MAX_RANDOM_INDEX_NUMBER = 2;
    public static boolean calc() {
        String[] sSigns = {"+", "-", "*"};
        Random random = new Random();
        int iRandomIndex = random.nextInt(MIN_RANDOM_INDEX_NUMBER, MAX_RANDOM_INDEX_NUMBER);
        int  iNumber = random.nextInt(MAX_RANDOM_NUMBER);
        int  iNumber1 = random.nextInt(MAX_RANDOM_NUMBER);
        boolean bResult = false;
        System.out.println("Question: " + iNumber + " " + sSigns[iRandomIndex] + " " + iNumber1);
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String sAnswer = scanner.next();
        int iAnswer = Integer.parseInt(sAnswer);
        int iCorrectAnswer = Eval.eval(iNumber, sSigns[iRandomIndex], iNumber1);

        if (iAnswer == iCorrectAnswer) {
            System.out.println("Correct!");
            bResult = true;
        } else {
            System.out.println("'" + iAnswer + "'" + " is wrong answer ;(. Correct answer was '"
                    + iCorrectAnswer + "'");
        }
        return bResult;
    };
}
