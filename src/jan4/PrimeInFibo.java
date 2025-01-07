package jan4;
import java.util.Scanner;
public class PrimeInFibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting");
		int start = scan.nextInt();
		System.out.println("Enter the range");
		int range=scan.nextInt();
		System.out.println("The fibnacci series are");
		fibonacci(start,range);
		scan.close();
	}
	public static void fibonacci(int start,int range) {
		int i;
		int num1=0;
		int num2=1;
		int res;
		for(i=1;range>=i;i++) {
			if(num1>=start && num1<=range && Primenumber(num1)) {
				System.out.println(num1);
			}
			res = num1+num2;
			num1=num2;
			num2=res;
		}
	}
	public static boolean Primenumber(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}
}
