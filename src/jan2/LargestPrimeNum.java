package jan2;
import java.util.Scanner;
public class LargestPrimeNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting range");
		int startrange = scan.nextInt();
		System.out.println("Enter the ending range");
		int endrange=scan.nextInt();
		Primenumberrange(startrange,endrange);
		scan.close();
	}
	public static void Primenumberrange(int startrange,int endrange) {
		int maxnum=0;
		for(int i=startrange;i<=endrange;i++) {
			if (Primenumber(i)) {
				maxnum=i;
			}
		}
		System.out.println("The largest prime numbers in the range of "+startrange+" to "+endrange+" is "+maxnum);

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
			if(num==2) {
				return true;
			}
		}
		return true;
		
	}
}
