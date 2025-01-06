package jan1;
import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		sumofnumbers(num);
		scan.close();
	}
	public static void sumofnumbers(int num) {
		int i;
		int sum=0;
		for(i=0;num>=i;i++) {
			sum+=i;
		}
		System.out.println("The sum of the first "+num+" natural numbers is "+sum);
	}
}
