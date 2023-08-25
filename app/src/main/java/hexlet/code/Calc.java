package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static boolean calc() {
        String[] sSigns = {"+","-","*"};
        Random random = new Random();
        int iRandomIndex = random.nextInt(0,2);
        int  iNumber = random.nextInt(100);
        int  iNumber1 = random.nextInt(100);
        String  sSign = String.valueOf((char)random.nextInt(26));
        boolean bResult = false;
        System.out.println("Question: " + iNumber + " " + sSigns[iRandomIndex] + " " + iNumber1);
        System.out.println("Your answer: ");
        var conEven = System.console();
        if (conEven != null) {
            Scanner sc = new Scanner(conEven.reader());
            int iAnswer = 0;
            iAnswer = sc.nextInt();

            if (iAnswer == Eval.eval(iNumber,sSigns[iRandomIndex],iNumber1)) {
                System.out.println("Correct!");
                bResult = true;
            } else {
                System.out.println("'" + iAnswer + "'" + " is wrong answer ;(. Correct answer was '" + Eval.eval(iNumber,sSigns[iRandomIndex],iNumber1) + "'");
            }
        }
        return bResult;
    };
}
