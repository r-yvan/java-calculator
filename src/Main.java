import java.util.Scanner;
import java.math.*;

class Calculator {
    public float add(float n1, float n2) {
        return n1 + n2;
    }

    public float multiply(float n1, float n2) {
        return n1 * n2;
    }

    public float subtract(float n1, float n2) {
        return n1 - n2;
    }

    public float divide(float n1, float n2) {
        return n1 / n2;
    }

    public double power(double n1, double n2) {
        return Math.pow(n1, n2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        while (true) {

            System.out.println("Enter the First Number: ");
            float num1 = scanner.nextFloat();

            System.out.println("Enter the Second Number: ");
            float num2 = scanner.nextFloat();

            System.out.println("Use the following signs: ");

            System.out.println();

            System.out.println("[+]: For Addition ");
            System.out.println("[-]: For Subtraction ");
            System.out.println("[*]: For Multiplication ");
            System.out.println("[/]: For Division ");
            System.out.println("[^]: For Powering ");

            System.out.println();

            System.out.println("Enter an Operation to be done on the numbers: ");
            String choice = scanner.next();

            if (!choice.isEmpty()) {
                float result = switch (choice) {
                    case "+" -> calc.add(num1, num2);
                    case "-" -> calc.subtract(num1, num2);
                    case "/" -> calc.divide(num1, num2);
                    case "*" -> calc.multiply(num1, num2);
                    case "^" -> (float) calc.power(num1, num2);
                    default -> 404;
                };
                System.out.println("The result is: [ " + result + " ]");
            }
        }
    }
}