package Decisions;
import java.util.Scanner;
public class loanEligibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the credit score");
		int credit = scan.nextInt();
		System.out.println("Enter the annual income in LPA");
		double income = scan.nextDouble();
		loan(credit,income);
	}
	public static void loan(int credit,double income) {
		if(credit >450 && income >= 4.0) {
			System.out.println("Eligible for loan");
			return;
		}
		else {
			System.out.println("Not Eligible for loan");
			return;
		}
	}
}
