package Decisions;
import java.util.Scanner;
public class posnegzero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		pos_neg_zero(num);
	}
	public static void pos_neg_zero(int num) {
		if (num>0) {
			System.out.println("The number is positive");
			return; 
		}
		else if(num<0) {
			System.out.println("The number is negative");
			return;
		}
		else {
			System.out.println("The number is zero");
			return;
		}
	}
}
