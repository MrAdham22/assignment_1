package Functions;

import java.util.Scanner;

public class Task_1 {
  static void arrayinput (int[] arr){
      Scanner input = new Scanner(System.in);
      for (int i = 0 ; i < arr.length ; i++){
          arr [i] = input.nextInt();
      }
  }

   static double getsummation (int[] arr){
        double sum = 0;
       for (int i = 0 ; i < arr.length ; i++){
         sum += arr[i];
     }
       return sum;
    }

    public static void main (String [] args){

      int [] numbers = new int [5];

      System.out.println("her is an array enter some numbers to fill it");
      arrayinput( numbers );

       System.out.println("Great her is there summation:");
       System.out.println(getsummation(numbers));

    }
}
