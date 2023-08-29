package hexlet.code;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Prime {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static boolean prime() {
        Random random = new Random();
        int  iNumber = random.nextInt(MAX_RANDOM_NUMBER);
        boolean bResult = false;
        System.out.println("Question: " + iNumber);
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if ((((isPrime(iNumber)) && (s.equals("yes"))) || (!isPrime(iNumber) && s.equals("no")))) {
            System.out.println("Correct!");
            bResult = true;
        } else {
            System.out.println("Wrong!");
        }
        return bResult;
    };
    public static boolean isPrime(int iInput) {
        if (iInput < 2) {
            return false;
        }
        double d = sqrt(iInput);
        for (int i = 2; i <= d; i++) {
            if (iInput % i == 0) {
                return false;
            }
        }
        return true;
    }
}
