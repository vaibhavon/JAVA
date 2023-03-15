/*****/
import java.util.Scanner;

public class Selection7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        int daysInMonth;
        
        switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }
        
        System.out.println("The number of days in month " + month + " of year " + year + " is " + daysInMonth);
    }

}
