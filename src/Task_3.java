import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = input.next().charAt(0);



        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel.");
        }
        else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println("It is a consonant.");
        }
        else {
            System.out.println("This is not a letter.");
        }
    }
}
