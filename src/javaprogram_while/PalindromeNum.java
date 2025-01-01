package javaprogram_while;
import java.util.Scanner;
public class PalindromeNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		palindrome(num);
		scan.close();
	}
	public static void palindrome(int num) {
		int rev = Reverse(num);
		if(rev==num) {
			System.out.println("The given number is a palindrome");
			return;
		}
		else {
			System.out.println("The given number is not a palindrome");
			return;
		}
	}
	public static int Reverse(int num) {
		int rev = 0;
		while(num>0) {
			int r = num%10;
			num/=10;
			rev=(rev*10)+r;
		}
		return rev;
	}
}
