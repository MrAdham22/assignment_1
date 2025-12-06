package Functions;

public class Task_5 {
    static int[] calculateeven(int []arr){
        int evencounter =0;
        int evensum = 0;
        for (int i = 0 ; i < arr.length ; i++ ){
           if(arr[i]%2==0) {
        evencounter+=1;
        evensum+=arr[i];
           }
        }
        return new int[]{evencounter, evensum};
    }

    public static void main (String[]args){

    }
}
