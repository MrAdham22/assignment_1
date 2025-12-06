package Functions;

public class Task_9 {
    public static void selectionsort (int []arr){
        for (int i = 0 ; i < arr.length ; i++){
            int swap;
            //int minindex = 0;

            for(int z = i ;z <arr.length ; z++ ){
                if (arr[i] > arr[z]) {
                    swap = arr[i];
                    arr[i] = arr[z];
                    arr[z] = swap;
                }
            }
                /* I tried to think of making the swap outside the for loop to make
                the code use less steps but I failed so I wanted to ask you is there another more efficient way to do this ? just a genuine question   :-) */
        System.out.println(arr[i]);
        }

    }

    public static void main (String[]args){
        int [] nums = {3, 66,34, 1, 32, 686,2 ,9, 34,7};
        selectionsort(nums);


    }
}
