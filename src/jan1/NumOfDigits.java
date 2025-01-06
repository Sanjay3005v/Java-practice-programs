package jan1;
import java.util.Scanner;
public class NumOfDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		long num = scan.nextLong();
		digitsOfNum(num);
		scan.close();
	}
	public static void digitsOfNum(long num) {
		int i=0;
		while (num>0) {
			num/=10;
			i++;
		}
		System.out.println("The number of digits in the number is "+i);
			
	}
}