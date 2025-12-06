package Loops;

public class Task_1 {
    public static void main (String[] args){

        System.out.println("Lets see what are the numbers divisible by 5 between 1 and 100");

        for ( int i =0 ; i < 100 ; i ++) {
            if (i % 5 == 0){
                System.out.println(i + " is Divisible by 5");
            }
        }
    }
}
