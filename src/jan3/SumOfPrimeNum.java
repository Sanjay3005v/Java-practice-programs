package jan3;
import java.util.Scanner;
public class SumOfPrimeNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting range");
		int startrange = scan.nextInt();
		System.out.println("Enter the ending range");
		int endrange=scan.nextInt();
		Primenumbersum(startrange,endrange);
		scan.close();
	}
	public static void Primenumbersum(int startrange,int endrange) {
		int sum=0;
		for(int i=startrange;i<=endrange;i++) {
			if (Primenumber(i)) {
				sum+=i;
			}
		}
		System.out.println("The sum of prime numbers in the range of "+startrange+" to "+endrange+" is "+sum);

		return;
	}
	public static boolean Primenumber(int num) {
		if (num<=1) {
			return false;
		}
		for(int i=2;i<(num-1);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
}
