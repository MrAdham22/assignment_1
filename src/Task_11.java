import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveSum = 0;
        int negativeSum = 0;

        System.out.println("Enter 6 Numbers:");

        for (int i = 1; i <= 6; i++) {
            int num = input.nextInt();

            if (num > 0) {
                positiveSum += num;
            }
            else {
                negativeSum += num;
            }

        }

        System.out.println("Sum of positive integers: " + positiveSum);
        System.out.println("Sum of negative integers: " + negativeSum);

    }
}
