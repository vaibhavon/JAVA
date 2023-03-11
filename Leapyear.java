import java.util.Scanner;
class Leapyear
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year=sc.nextInt();
		  if (year%4==0) {
		  	  System.out.print(year+" is leap year");
		  }else {
		  	  System.out.print(year+" is not a leap year");
		  }
	}
}
