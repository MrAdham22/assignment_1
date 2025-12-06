package Functions;

public class Task_7 {

    static void countGeneral (int [] arr) {
        for (int i = 0 ; i < arr.length ; i++){

            int counter = 0;
            boolean alreadycounted = false;

            for (int k =0 ; k < i ; k++){
                if (arr[k] == arr[i]){
                    alreadycounted = true;
                    break;
                }
            }
            if (alreadycounted){
                continue;
            }
                for (int z =i ; z < arr.length ; z++) {

                    if (arr[i] == arr[z]) {
                        counter += 1;
                    }
                }
            System.out.println("The number " + arr[i] + " was repeated -->" + counter + " times");
        }


    }

    public static void main (String[]args){
        int []nums = {3 , 4, 4 , 2, 3 , 3 , 6 , 8 , 3 };
        countGeneral(nums);


    }
}
