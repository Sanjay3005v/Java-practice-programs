package Decisions;
import java.util.Scanner;
public class largestOf2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		largest(a,b);
	}
	public static void largest(int a,int b) {
		if(a>b) {
			System.out.println("The largest number is "+a);
			return;
		}
		else if(b>a) {
			System.out.println("The largest number is "+b);
			return;
		}
		else {
			System.out.println("Both the numbers are same");
			return;
		}
	}
}
