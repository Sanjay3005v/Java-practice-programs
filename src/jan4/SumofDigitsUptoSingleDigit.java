package jan4;
import java.util.Scanner;
public class SumofDigitsUptoSingleDigit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		Sumdigits(num);
		scan.close();
	}
	public static void Sumdigits(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		if(sum>9) {
			Sumdigits(sum);
		}
		else {
			System.out.println("The sum of the digits is "+sum);
			return;
		}
	}
}
