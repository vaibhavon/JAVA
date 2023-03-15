/*****/
import java.util.Scanner;

public class Selection3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double costPrice = scanner.nextDouble();
        System.out.print("Are you a student? (Y/N): ");
        String userInput = scanner.next();
        boolean isStudent = userInput.equalsIgnoreCase("Y");
        double discount;
        if (isStudent) {
            if (costPrice > 500) {
                discount = 0.1 * costPrice;
            } else {
                discount = 0.05 * costPrice;
            }
        } else {
            if (costPrice > 500) {
                discount = 0.08 * costPrice;
            } else {
                discount = 0.02 * costPrice;
            }
        }
        double finalPrice = costPrice - discount;
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Price: %.2f\n", finalPrice);

    }
}
