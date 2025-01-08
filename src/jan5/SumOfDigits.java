package jan5;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		Proddigits(num);
		scan.close();
	}
	public static void Proddigits(int num) {
		int prod=1;
		while(num>0) {
			int rem=num%10;
			prod*=rem;
			num/=10;
		}
		if(prod>9) {
			Proddigits(prod);
		}
		else {
			System.out.println("The Product of the digits is "+prod);
			return;
		}
	}
}
