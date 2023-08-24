package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static boolean even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        int  iNumber = random.nextInt(100);
        boolean bResult = false;
        System.out.println("Question: " + iNumber);
        System.out.println("Your answer: ");
        var conEven = System.console();
        if (conEven != null) {
            Scanner sc = new Scanner(conEven.reader());
            String s = "";
            s = sc.nextLine();
            if ((((iNumber%2 == 0)&&(s.equals("yes"))) || (!(iNumber%2 == 0)&&s.equals("no")))) {
                System.out.println("Correct!");
                bResult = true;
            } else {
                System.out.println("Wrong!");
            }
        }
        return bResult;
    };
}
