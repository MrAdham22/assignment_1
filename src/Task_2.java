import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();

        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        }
        else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        }
        else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        }
        else if (month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        }
        else {
            season = "Invalid month number";
        }

        System.out.println("Season: " + season);
    }
}
