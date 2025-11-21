package Loops;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = input.nextInt();

        int count = 0;
        int temp = Math.abs(number);

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }

}
