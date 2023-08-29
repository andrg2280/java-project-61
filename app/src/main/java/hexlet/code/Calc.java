package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static boolean calc() {
        String[] sSigns = {"+", "-", "*"};
        Random random = new Random();
        int iRandomIndex = random.nextInt(0, 2);
        int  iNumber = random.nextInt(100);
        int  iNumber1 = random.nextInt(100);
        String  sSign = String.valueOf((char) random.nextInt(26));
        boolean bResult = false;
        System.out.println("Question: " + iNumber + " " + sSigns[iRandomIndex] + " " + iNumber1);
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        int iAnswer = scanner.nextInt();
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
