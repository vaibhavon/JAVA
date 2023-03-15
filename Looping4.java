import java.util.Scanner;

public class Looping4 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      int num = input.nextInt();

      for (int i = 1; i <= num; i++) {
         int cube = i * i * i;
         System.out.println("Number is: "+i+" and cube of "+i+" is: "+cube);
      }
   }
}
