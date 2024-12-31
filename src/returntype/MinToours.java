package returntype;
import java.util.Scanner;
public class MinToours {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value in  minutes");
		int num = scan.nextInt();
		double res = Hour(num);
		System.out.println("The value in hours is "+res);
	}
	public static double Hour(int num) {
		double res = (double)num/60;
		return res;
	}
}
