/*****/
import java.util.Scanner;

public class Selection5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        System.out.println("The largest number is: " + largest);
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("The three numbers are equal");
        } else {
            System.out.println("The three numbers are not equal");
        }
    }

}

