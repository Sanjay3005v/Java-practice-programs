package jan1;
import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		Primenumber(num);
		scan.close();
	}
	public static void Primenumber(int num) {
		int i;
		if (num<=1) {
			System.out.println("The number "+num+" is not a prime number");
			return;
		}
		for(i=2;i<(num-1);i++) {
			if(num%i==0) {
				System.out.println("The number "+num+" is not a prime number");
				return;
			}
		}
		System.out.println("The number "+num+" is a prime number");
		return;
		}
}
	

