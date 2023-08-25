package hexlet.code;
import java.util.Scanner;

public class App {
    static String sUserName = "";
    public static String getUserName() {
        var conGreet = System.console();
        if (conGreet != null) {
            Scanner sc = new Scanner(conGreet.reader());
            sUserName = sc.nextLine();
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
        System.out.println("0 - Exit");
        var con = System.console();
        if (con != null) {
            Scanner sc = new Scanner(con.reader());
            int iInput = 0;
            iInput = sc.nextInt();

            switch (iInput) {
                case 0 -> System.exit(0);
                case 1 -> greet();
                case 2 -> {
                    greet();
                    System.out.println("Welcome to the Brain Games!");
                    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                    boolean bResult = true;
                    for (var i = 0; i<3; i++){
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
                    for (var i = 0; i<3; i++){
                        bResult = Calc.calc() && bResult;
                    }
                    if (bResult) {
                        System.out.println("Congratulations, " + sUserName + "!");
                    }
                }
                default -> {
                }
            }
        }
    };
}
