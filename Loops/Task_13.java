package Loops;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        double number = input.nextDouble();

        int count = 0;

        while (number >= 1) {
            number /= 2;
            count++;
        }

        System.out.println("The number can be divided by 2, " + count + " times before it becomes less than 1.");
    }
}
