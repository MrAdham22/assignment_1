import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("choose your input:");
        System.out.println("    1-Number    2-Text");
        int input0 = input.nextInt();

        if (input0==1) {
            System.out.println("Enter the month's number:");
            int input1 = input.nextInt();
                if (input1 == 1) {
                     System.out.println("this is January");
                 }
                else if (input1 == 2) {
                    System.out.println("this is February");
                }
                else if (input1 == 3){
                    System.out.println("this is March");
                }
                else if (input1 == 4) {
                    System.out.println("this is April");
                }
                else if (input1 == 5) {
                    System.out.println("this is May");
                }
                else if (input1 == 6) {
                    System.out.println("this is June");
                }
                else if (input1 == 7) {
                    System.out.println("this is July");
                }
                else if (input1 == 8) {
                    System.out.println("this is August");
                }
                else if (input1 == 9) {
                    System.out.println("this is September");
                }
                else if (input1 == 10) {
                    System.out.println("this is October");
                }
                else if (input1 == 11) {
                    System.out.println("this is November");
                }
                else if (input1 == 12) {
                    System.out.println("this is December");
                }
                else {
                    System.out.println("Invalid month number");
                     }
            }

            else{
                System.out.println("Enter the month's name:");
                input.nextLine();
                String input2 = input.nextLine();
                input2 = input2.trim().toLowerCase();
                input2= input2.substring(0,3);

                switch(input2){
                    case "jan":
                        System.out.println("Month number is 1 ");
                        break;
                    case "feb":
                        System.out.println("Month number is 2 ");
                        break;
                    case "mar":
                        System.out.println("Month number is 3 ");
                        break;
                    case "apr":
                        System.out.println("Month number is 4 ");
                        break;
                    case "may":
                        System.out.println("Month number is 5 ");
                        break;
                    case "jun":
                        System.out.println("Month number is 6 ");
                        break;
                    case "jul":
                        System.out.println("Month number is 7 ");
                        break;
                    case "aug":
                        System.out.println("Month number is 8 ");
                        break;
                    case "sep":
                        System.out.println("Month number is 9 ");
                        break;
                    case "oct":
                        System.out.println("Month number is 10 ");
                        break;
                    case "nov":
                        System.out.println("Month number is 11 ");
                        break;
                    case "dec":
                        System.out.println("Month number is 12 ");
                        break;
                    default:
                        System.out.println("what the heck did you write");


                }
            }
    }
}