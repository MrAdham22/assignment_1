package Functions;

public class Task_3 {

    public static int getMax (int []arr){
       int max = arr [0];
       for (int i = 1; i < arr.length; i++ ){
           max = arr[i] > max?  arr[i] :max ;
       }
        return max;
    }

    public static void main (String[] arg){

        int[] nums = {3,4,53,4,3,23,423,3};

        System.out.println (getMax(nums));
    }
}
