package javaprogram_while;
import java.util.Scanner;
public class ReverseOfNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		Reverse(num);
		scan.close();
	}
	public static void Reverse(int num) {
		int rev = 0;
		while(num>0) {
			int r = num%10;
			num/=10;
			rev=(rev*10)+r;
		}
		System.out.println(rev);
	}
}
