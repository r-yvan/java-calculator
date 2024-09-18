import java.util.Scanner;
import java.math.*;

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }

    public int power(int n1, int n2) {
        return n1 ^ n2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        while (true) {
            System.out.println("Enter the First Number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter the Second Number: ");
            int num2 = scanner.nextInt();

            System.out.println("Enter an Operation to be done on the numbers: ");
            System.out.println("[+]: For Addition ");
            System.out.println("[-]: For Subtraction ");
            System.out.println("[*]: For Multiplication ");
            System.out.println("[/]: For Division ");

            String choice = scanner.next();

            if (! choice.isEmpty()) {
                switch (choice) {
                    case "+" -> calc.add(num1, num2);
                    case "-" -> calc.subtract(num1, num2);
                    case "/" -> calc.divide(num1, num2);
                    case "*" -> calc.multiply(num1, num2);
                    default -> System.out.println("You entered and Invalid Operation !!");
                }
            }
        }
    }
}