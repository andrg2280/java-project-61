package hexlet.code;
import java.util.Scanner;

public class App {
    public static final int GAME0 = 0;
    public static final int GAME1 = 1;
    public static final int GAME2 = 2;
    public static final int GAME3 = 3;
    public static final int GAME4 = 4;
    public static final int GAME5 = 5;
    public static final int GAME6 = 6;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GDC");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int gameSelected = scanner.nextInt();
        System.out.println("Your choice is: " + gameSelected);
        switch (gameSelected) {
            case GAME0 -> {
            }
            case GAME1 -> {
                Greet.greet();
            }
            case GAME2 -> {
                Even.even();
            }
            case GAME3 -> {
                Calc.calc();
            }
            case GAME4 -> {
                Nod.nod();
            }
            case GAME5 -> {
                Prog.prog();
            }
            case GAME6 -> {
                Prime.prime();
            }
            default -> {
            }
        }
    }
}
