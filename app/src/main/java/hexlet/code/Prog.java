package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prog {
    public static boolean prog() {
        Random random = new Random();
        int iNumber = random.nextInt(10);
        int iNumber1 = random.nextInt(9);
        int iNumberVoid = 0;
        String sProgress = "";
        for (int i = 1; i < 11; i++) {
            if (iNumber1 == (i - 1)) {
                sProgress = sProgress + " .. ";
                iNumberVoid = (i * iNumber);
            } else {
                sProgress = sProgress + " " + (i * iNumber);
            }
        }
        boolean bResult = false;
        System.out.println("Question: " + sProgress);
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String sAnswer = scanner.next();
        int iInput = Integer.parseInt (sAnswer);
        if (iInput == iNumberVoid) {
            System.out.println("Correct!");
            bResult = true;
        } else {
            System.out.println("'" + iInput + "'" + " is wrong answer ;(. Correct answer was '" + iNumberVoid + "'");
        }
        return bResult;
    };
}
