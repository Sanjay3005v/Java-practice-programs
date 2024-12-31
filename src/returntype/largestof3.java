package returntype;

import java.util.Scanner;
public class largestof3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scan.nextInt();
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
		System.out.println("Enter the third number:");
		int c = scan.nextInt();
		int r = largest(a,b,c);
		System.out.println("The largest of the three numbers is "+ r);
	}
	public static int largest(int a,int b,int c) {
		int ans = a>b?a:b;
		int res = ans>c?ans:c;
		return res;
	}
	
}
