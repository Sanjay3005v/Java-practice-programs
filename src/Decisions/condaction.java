package Decisions;

import java.util.Scanner;
public class condaction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		weird(num);
		
	}
	public static void weird(int num) {
		if(num%2!=0) {
			System.out.println("Weird");
			return;
		}
		else if ((num<=6 && num>=2)||(num>20)) {
			System.out.println("Not Weird");
			return;
		}
		else if (num<=20 && num>=7) {
			System.out.println("Weird");
			return;
		}
		
	}
}
