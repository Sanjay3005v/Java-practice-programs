package jan1;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		perfectnum(num);
		scan.close();
	}
	public static void perfectnum(int num) {
		int i=1;
		int sum=0;
		while(num>i) {
			if(num%i==0) {
			 sum+=i;
			}
			i++;
		}
		if(num==sum) {
			System.out.println("The number "+num+" is a perfect number");
		
		return;
		}
		else {
			System.out.println("The number "+num+" is not a perfect number");
		}
	}
}
