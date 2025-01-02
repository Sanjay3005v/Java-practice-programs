package javaprogram_while;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		sumofdig(num);
		scan.close();
	}
	public static void sumofdig(int num) {
		int sum = 0;
		while(num>0) {
			int r = num%10;
			num/=10;
			sum=sum+r;
		}
		System.out.println("The sum of the digits of the given number is "+sum);
	}
}
