package hexlet.code;

public class Eval {
    public static int eval(int a, String operator, int b) {
        int r = 0;
        switch (operator) {
            case "/":
                r += a / b;
                break;
            case "*":
                r += a * b;
                break;
            case "-":
                r += a - b;
                break;
            case "+":
                r += a + b;
                break;
        }

        return r;
    }
}
