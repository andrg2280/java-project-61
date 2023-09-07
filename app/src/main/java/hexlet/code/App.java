package hexlet.code;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Nod;
import hexlet.code.Games.Even;
import hexlet.code.Games.Prog;
import hexlet.code.Games.Prime;


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GDC");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String gameSelected = scanner.next();
        System.out.println("Your choice is: " + gameSelected);
        switch (gameSelected) {
            case "1" -> Cli.greet();
            case "2" -> Even.calculateEvenNumber();
            case "3" -> Calc.calculateExpression();
            case "4" -> Nod.calculateGCD();
            case "5" -> Prog.calculateMissingDigit();
            case "6" -> Prime.calculatePrimeNumber();
            default -> {
            }
        }
    }
}
