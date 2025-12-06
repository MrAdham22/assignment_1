package Functions;

public class Task_4 {

    public static int getMin (int []arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++ ){
            min = arr[i] < min?  arr[i] :min ;
        }
        return min;
    }

    public static void main (String[] arg){

        int[] nums = {3,4,53,4,3,23,423,3};

        System.out.println (getMin(nums));
    }
}