package javaprogram_while;
import java.util.Scanner;
public class FactorialOfNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		factorial(num);
		scan.close();
	}
	public static void factorial(int num) {
		int num1=num;
		long fact =1;
		while(num>0) {
			fact*=num;
			num--;
		}
		System.out.println("The factorial of "+num1+" is "+fact);
	}
}
