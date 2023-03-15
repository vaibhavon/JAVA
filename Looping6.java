
import java.util.Scanner;

public class Looping6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number of term : ");
        int n = input.nextInt();

        int sum = 0;
        System.out.println("The odd Number is  ");
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber + " ");
            sum += oddNumber;
        }
        System.out.println("\nThe sum of the first " + n + " odd natural numbers is: " + sum);
    }
}
