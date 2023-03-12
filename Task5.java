import java.util.Scanner;
class Task5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int no=sc.nextInt();
		int fact=1,i=0;
		  while (i<no) {
             fact=fact*no;
             --no;
		  }
	System.out.print("The factorial is "+fact);
	}
}