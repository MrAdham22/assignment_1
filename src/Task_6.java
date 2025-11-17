import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int marks = input.nextInt();

        if (marks >= 80) {
            System.out.println("Your grade is A");
        }
        else if (marks >= 60) {
            System.out.println("Your grade is B");
        }
        else if (marks >= 40) {
            System.out.println("Your grade is C");
        }
        else if (marks >= 0) {
            System.out.println("Your grade is F");
        }
        else {
            System.out.println("Invalid marks!");
        }
    }
}
