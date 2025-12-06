package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
    static void binarysearch(int[]arr){
        Scanner input = new Scanner(System.in);
        Arrays.sort(arr);

        System.out.println("enter the number you want to find here in this arrary:");
        int numtosearch = input.nextInt();
        int mid=0;
        int start = 0;
        int end = arr.length-1;
        while (start<= end){
            mid = (start + end)/2;

           if (arr[mid] == numtosearch){
               break;
           } if (numtosearch < arr[mid]){
                end = mid - 1;
            }
            if (numtosearch > arr[mid]) {
                start = mid + 1 ;
            }

        }
        System.out.println(
                start > end
                ? "Nop couldn't find it here"
                : "here is the number it's at index --> " + mid
        );
    }
    public static void main (String[]args){
        int [] nums = {1,2,4,6,9,20,30,40};
        binarysearch(nums);
    }
}
