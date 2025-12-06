package Loops;

import java.util.Scanner;

public class Task_9 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double counter = 0;
        double sum = 0;
        System.out.println("Enter a number hopefully a +ve one :");
        while (true){
            int num = input.nextInt();
            if (num<0){
                break;
            }
            sum+=num;
            counter++;
        }
            double average = sum / counter;
            System.out.println("Braa why a negative number");
            System.out.println("Any ways her is the average of the +ve numbers that you entered :");
            System.out.println("you entered " + counter + " numbers and the average = " + average);

        }
    }






/*
 System.out.println("Enter a number hopefully a +ve one :");
        int input0 = input.nextInt();
            if (input0  > 0) {
                while (input0 > 0) {
                    counter += 1;
                    sum += input0;
                    average = sum / counter;
                    System.out.println("Another one ");
                    int input1 = input.nextInt();
                    input0 = input1;
                }
            }
                if(input0 <0 ){
                    System.out.println("Braa why a negative number");
                    System.out.println("Any ways her is the average of the +ve numbers that you entered :");
                    System.out.println("you entered " + counter + " numbers and the average = " + average);
                }
                else {
                    System.out.println("HELLOO enter a number not nothing Focus please ");
                    int input2= input.nextInt();
                    input0 = input2;
                    while (input0 > 0) {
                        counter += 1;
                        sum += input0;
                        average = sum / counter;
                        System.out.println("Another one ");
                        int input1 = input.nextInt();
                        input0 = input1;
                        if(input0 <0 ){
                            System.out.println("Braa why a negative number");
                            System.out.println("Any ways her is the average of the +ve numbers that you entered :");
                            System.out.println("you entered " + counter + " numbers and the average = " + average);
                        }
                    }
                }
 */