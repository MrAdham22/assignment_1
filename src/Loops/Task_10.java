package Loops;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter some integer numbers");
        int num1 = input.nextInt();
        int num2=0;
        int sum = 0;

        while (num2 !=0 ) {
            int digit = num2 % 10;
            sum += digit;
            num2/=10;
        }
        System.out.println("the sum of those numbers is : " + sum);
    }
}
