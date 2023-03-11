import java.util.Scanner;
class LargestNumber
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int a=in.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b=in.nextInt();
		System.out.print("Enter 3rd Number: ");
		int c=in.nextInt();
		int big;
			if (a>b) {
				if (a>c) {
					 big=a;
				}
				else{
					big=c;
				}
			}
			else{
				if (b>c) {
					big=b;
				}
				else{
					big=c;
				}
			}
		System.out.print("Bigger Number is "+big);
	}
}
