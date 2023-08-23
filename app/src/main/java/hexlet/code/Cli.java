package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greet() {
        System.out.println("May I have your name ?");
        var con = System.console();
        if (con != null) {
            Scanner sc = new Scanner(con.reader());
            String s = "";
            s = sc.nextLine();
            System.out.println("Hello, " + s);
        }
    };
}
