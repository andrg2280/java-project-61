package hexlet.code;
import java.util.Scanner;

public class App {
    private static String sUserName = "";
    public static final int MAX_PROMPT_NUMBER = 3;
    public static final int GAME0 = 0;
    public static final int GAME1 = 1;
    public static final int GAME2 = 2;
    public static final int GAME3 = 3;
    public static final int GAME4 = 4;
    public static final int GAME5 = 5;
    public static final int GAME6 = 6;
    public static String getUserName() {
        if (sUserName.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            sUserName = scanner.next();
        }
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
            case GAME0 -> System.exit(0);
            case GAME1 -> {
                greet();
                System.exit(0);
            }
            case GAME2 -> {
                greet();
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                for (int i = 0; i < MAX_PROMPT_NUMBER; i++) {
                    if (Even.even()) {
                        System.out.println("Congratulations, " + sUserName + "!");
                    } else {
                        System.out.println("Let's try again, " + sUserName + "!");
                        System.exit(0);
                    }
                }
            }
            case GAME3 -> {
                greet();
                System.out.println("What is the result of the expression?");
                for (int i = 0; i < MAX_PROMPT_NUMBER; i++) {
                    if (Calc.calc()) {
                        System.out.println("Congratulations, " + sUserName + "!");
                    } else {
                        System.out.println("Let's try again, " + sUserName + "!");
                        System.exit(0);
                    }
                }
            }
            case GAME4 -> {
                greet();
                System.out.println("Find the greatest common divisor of given numbers.");
                for (int i = 0; i < MAX_PROMPT_NUMBER; i++) {
                    if (Nod.nod()) {
                        System.out.println("Congratulations, " + sUserName + "!");
                    } else {
                        System.out.println("Let's try again, " + sUserName + "!");
                        System.exit(0);
                    }
                }
            }
            case GAME5 -> {
                greet();
                System.out.println("What number is missing in the progression?");
                for (int i = 0; i < MAX_PROMPT_NUMBER; i++) {
                    if (Prog.prog()) {
                        System.out.println("Congratulations, " + sUserName + "!");
                    } else {
                        System.out.println("Let's try again, " + sUserName + "!");
                        System.exit(0);
                    }
                }
            }
            case GAME6 -> {
                greet();
                System.out.println("Your choice: 6");
                System.out.println();
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                for (int i = 0; i < MAX_PROMPT_NUMBER; i++) {
                    if (Prime.prime()) {
                        System.out.println("Congratulations, " + sUserName + "!");
                    } else {
                        System.out.println("Let's try again, " + sUserName + "!");
                        System.exit(0);
                    }
                }
            }
            default -> {
            }
        }
    }
}
