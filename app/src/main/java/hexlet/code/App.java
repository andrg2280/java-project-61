package hexlet.code;
import java.util.Scanner;

public class App {
    static String sUserName = "";
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        sUserName = scanner.next();
        return sUserName;
    }
    public static void main(String[] args) {
        firstInput();
    };
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name ?");
        System.out.println("Hello, " + getUserName() + "!");
    };
    public static void firstInput() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GDC");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.next();
        int iInput = Integer.parseInt(selectedGame);
        switch (iInput) {
            case 0 -> System.exit(0);
            case 1 -> greet();
            case 2 -> {
                greet();
                System.out.println("Welcome to the Brain Games!");
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                boolean bResult = true;
                for (var i = 0; i < 3; i++) {
                    bResult = Even.even() && bResult;
                }
                if (bResult) {
                    System.out.println("Congratulations, " + sUserName + "!");
                }
            }
            case 3 -> {
                greet();
                System.out.println("Welcome to the Brain Games!");
                System.out.println("What is the result of the expression?");
                boolean bResult = true;
                for (var i = 0; i < 3; i++) {
                    bResult = Calc.calc() && bResult;
                }
                if (bResult) {
                    System.out.println("Congratulations, " + sUserName + "!");
                }
            }
            case 4 -> {
                greet();
                System.out.println("Welcome to the Brain Games!");
                System.out.println("Find the greatest common divisor of given numbers.");
                boolean bResult = true;
                for (var i = 0; i < 3; i++) {
                    bResult = Nod.nod() && bResult;
                }
                if (bResult) {
                    System.out.println("Congratulations, " + sUserName + "!");
                } else {
                    System.out.println("Let's try again, " + App.sUserName + "!");
                }
            }
            case 5 -> {
                greet();
                System.out.println("Welcome to the Brain Games!");
                System.out.println("What number is missing in the progression?");
                boolean bResult = true;
                for (var i = 0; i < 3; i++) {
                    bResult = Prog.prog() && bResult;
                }
                if (bResult) {
                    System.out.println("Congratulations, " + sUserName + "!");
                } else {
                    System.out.println("Let's try again, " + App.sUserName + "!");
                }
            }
            case 6 -> {
                greet();
                System.out.println("Your choice: 6");
                System.out.println();
                System.out.println("Welcome to the Brain Games!");
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                boolean bResult = true;
                for (var i = 0; i < 3; i++) {
                    bResult = Prime.prime() && bResult;
                }
                if (bResult) {
                    System.out.println("Congratulations, " + sUserName + "!");
                }
            }
            default -> {
            }
        }
    };
}
