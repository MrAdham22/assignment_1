import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the watermelon:");
        int weight = input.nextInt();

        if (weight > 2 && weight % 2 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
