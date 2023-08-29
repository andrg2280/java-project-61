package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static boolean even() {
        Random random = new Random();
        int  iNumber = random.nextInt(MAX_RANDOM_NUMBER);
        boolean bResult = false;
        System.out.println("Question: " + iNumber);
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.next();
        if ((((iNumber % 2 == 0) && (selectedGame.equals("yes")))
                || (!(iNumber % 2 == 0) && selectedGame.equals("no")))) {
            System.out.println("Correct!");
            bResult = true;
        } else {
            System.out.println("Wrong!");
        }
        return bResult;
    };
}
