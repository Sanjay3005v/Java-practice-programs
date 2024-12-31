package Decisions;

import java.util.Scanner;
public class last_digit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		if (num%10==0) {
			System.out.println("The number ends with zero");
		}
		else {
			System.out.println("The number doesn't ends with zero");
		}
	}
	
}
