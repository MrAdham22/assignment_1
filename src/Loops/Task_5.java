package Loops;

import java.util.Scanner;

public class Task_5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get it's factorial:");
        int num = input.nextInt();
        int result = 1;
        for (int i = 1 ; i <= num ; i++){
            result *= i;
        }

        System.out.println("The factorial of " + num + " = " + result);
    }
}
