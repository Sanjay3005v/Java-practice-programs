package jan2;
import java.util.Scanner;
public class SumOf2Digs_is3rd {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the 3 digit number");
	int num = scan.nextInt();
	sum(num);
}
	public static void sum(int num) {
		int temp=num;
		int rev=0;
		int sum=0;
		while (temp>0) {
			int a =temp%10;
			rev=(rev*10)+a;
			temp/=10;
		}
		for(int j=1;j>=2;j++) {
			int x=rev%10;
			sum+=x;
		}
		if(sum==num) {
			System.out.println("The number checks the condition");
		}
		else {
			System.out.println("The number does not check the condition");

		}
	}
}	