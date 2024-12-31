package Decisions;

import java.util.Scanner;
public class largest_of_three {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a =scan.nextInt();
		System.out.println("Enter the second number:");
		int b =scan.nextInt();
		System.out.println("Enter the third number:");
		int c =scan.nextInt();
		largest(a,b,c);
	}
	public static void largest(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println("The largest number is "+a);
			return;
		}
		if(b>a&&b>c) {
			System.out.println("The largest number is "+b);
			return;
		}
		if(c>a&&c>b) {
			System.out.println("The largest number is "+c);
			return;
		}
	}

}
