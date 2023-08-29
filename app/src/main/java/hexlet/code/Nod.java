package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Nod {
    public static boolean nod() {
        Random random = new Random();
        int  iNumber = random.nextInt(100);
        int  iNumber1 = random.nextInt(100);
        boolean bResult = false;
        System.out.println("Question: " + iNumber + " " + iNumber1);
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String sAnswer = scanner.next();
        int iInput = Integer.parseInt(sAnswer);
        int iCorrectAnswer = gcdBF(iNumber, iNumber1);
        if (iInput == iCorrectAnswer) {
            System.out.println("Correct!");
            bResult = true;
        } else {
            System.out.println("'" + iInput + "'" + " is wrong answer ;(. Correct answer was '" + iCorrectAnswer + "'");
        }
        return bResult;
    }
    static int gcdBF(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
