package kyu8;

public class SimpleCalculator {

    public static void main(String[] args) {
        System.out.println(calculate(10, 20, "%"));
    }

    public static double calculate(double a, double b, String op) {

        double res;
        /*
          return switch (op) {
          case "+" -> a + b;
          case "-" -> a - b;
          case "*" -> a * b;
          case "/" -> a / b;
          default -> throw new IllegalArgumentException();
    };
         */
        switch (op) {
            case "+":
                res = a + b;
                return res;
            case "-":
                res = a - b;
                return res;
            case "*":
                res = a * b;
                return res;
            case "/":
                res = a / b;
                return res;
            default:
                throw new IllegalArgumentException();

        }
    }
}
