package Loops;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Heyy lets power up some numbers");
        System.out.println("1st enter your base number");
        int base = input.nextInt();
        System.out.println("Now enter the power ");
        int power = input.nextInt();
        int result = 1;
            for (int i = 1; i <= power ; i++ ){
                 result *= base;
            }
        System.out.println("her is your result ");
        System.out.println(base + "^" + power + " = " + result ) ;
    }
}
