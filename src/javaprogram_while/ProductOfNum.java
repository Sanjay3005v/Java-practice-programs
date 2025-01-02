package javaprogram_while;
import java.util.Scanner;

public class ProductOfNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		prodofdig(num);
		scan.close();
	}
	public static void prodofdig(int num) {
		int prod = 1;
		while(num>0) {
			int r = num%10;
			num/=10;
			prod=prod*r;
		}
		System.out.println("The sum of the digits of the given number is "+prod);
	}
}
