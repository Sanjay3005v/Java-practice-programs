//Write a java program to sum all the even digits in a number.



package Jan22;
import java.util.Scanner;
public class SumOfEvenDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =scan.nextInt();
		SumEven(num);
		scan.close();
	}
	public static void SumEven(int num) {
		int sum=0;
		while(num>0) {
			int digit=num%10;
			if(digit%2==0) {
				sum+=digit;
			}
			num/=10;
		}
		System.out.println("The sum of the even digits in the number is "+sum);
	}
}
