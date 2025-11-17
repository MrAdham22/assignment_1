import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Choose an operation : ");
        System.out.print("1.+   2.-   3.*   4./");
        int op = input.nextInt();

        double result;

        if (op == 1) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if (op == 2) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if (op == 3) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if (op == 4) {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
            }
            else {
                result = num1 / num2;
                System.out.println("Result: " + result);
            }
        }
        else {
            System.out.println("Invalid operation.");
        }
    }
}
