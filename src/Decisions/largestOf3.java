package Decisions;
import java.util.Scanner;
public class largestOf3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		System.out.println("Enter the third number");
		int c = scan.nextInt();
		largest(a,b,c);
	}
	public static void largest(int a, int b, int c) {
		if (a>b && a>c) {
			System.out.println("The largest number is "+a);
			return;
		}
		else if(b>a && b>c) {
			System.out.println("The largest number is "+b);
			return;
		}
		else if(c>a && c>b) {
			System.out.println("The largest number is "+c);
			return;
		}
		else {
			System.out.println("All the numbers are same");
			return;
		}
	}
}
