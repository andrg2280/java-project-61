package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prog {
    public static final int PROGRESSION_LENGTH = 11;
    public static final int MIN_NUMBER = 9;
    public static final int MAX_NUMBER = 10;
    public static boolean prog() {
        Random random = new Random();
        int iNumber = random.nextInt(MAX_NUMBER);
        int iNumber1 = random.nextInt(MIN_NUMBER);
        int iNumberVoid = 0;
        String sProgress = "";
        for (int i = 1; i < PROGRESSION_LENGTH; i++) {
            if (iNumber1 == (i - 1)) {
                sProgress = sProgress.trim() + " .. ";
                iNumberVoid = (i * iNumber);
            } else {
                sProgress = sProgress + (i * iNumber) + " ";
            }
        }
        boolean bResult = false;
        System.out.println("Question: " + sProgress.trim());
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String sAnswer = scanner.next();
        int iInput = Integer.parseInt(sAnswer);
        if (iInput == iNumberVoid) {
            System.out.println("Correct!");
            bResult = true;
        } else {
            System.out.println("'" + iInput + "'" + " is wrong answer ;(. Correct answer was '" + iNumberVoid + "'");
        }
        return bResult;
    };
}
