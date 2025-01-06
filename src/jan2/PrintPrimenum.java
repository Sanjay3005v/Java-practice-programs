package jan2;
import java.util.Scanner;

public class PrintPrimenum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int num = scan.nextInt();
		Primenumberrange(num);
		scan.close();
	}
	public static boolean Primenumber(int num) {
		if (num<=1) {
			return false;
		}
		for(int i=2;i<(num-1);i++) {
			if(num%i==0) {
				return false;
			}
			if(num==2) {
				return true;
			}
		}
		return true;
		}
	public static void Primenumberrange(int num) {
		System.out.println("The prime numbers in the range of 1 to "+num+" is");
		for(int i=0;i<=num;i++) {
			if (Primenumber(i)) {
				System.out.println(i);
			}
		}
		return;
	}
}
