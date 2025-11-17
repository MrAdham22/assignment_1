import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float num1 = input.nextFloat();

        System.out.println("Enter the second number:");
        float num2 = input.nextFloat();

        System.out.println("Enter the third number:");
        float num3 = input.nextFloat();

        float first, second, third;

        if (num1 <= num2 && num1 <= num3) {
            first = num1;
            if (num2 <= num3) {
                second = num2;
                third = num3;
            }
            else {
                second = num3;
                third = num2;
            }
        }
        else if (num2 <= num1 && num2 <= num3) {
            first = num2;
            if (num1 <= num3) {
                second = num1;
                third = num3;
            }
            else {
                second = num3;
                third = num1;
            }
        }
        else {
            first = num3;
            if (num1 <= num2) {
                second = num1;
                third = num2;
            }
            else {
                second = num2;
                third = num1;
            }
        }

        System.out.println("Numbers in ascending order: " + first + ", " + second + ", " + third);
    }
}
