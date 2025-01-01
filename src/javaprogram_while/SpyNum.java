package javaprogram_while;
import java.util.Scanner;

public class SpyNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		spynumber(num);
		scan.close();
	}
	public static void spynumber(int num) {
		int sum =sumofdig(num);
		int prod=prodofdig(num);
		if (sum==prod) {
			System.out.println("The given number is a spy number");
			return;
		}
		else {
			System.out.println("The given number is not a spy number");
			return;
		}
	}
	public static int sumofdig(int num) {
		int sum = 0;
		while(num>0) {
			int r = num%10;
			num/=10;
			sum=sum+r;
		}
		return sum;
	}
	public static int prodofdig(int num) {
		int prod = 1;
		while(num>0) {
			int r = num%10;
			num/=10;
			prod=prod*r;
		}
		return prod;
	}
}
