package jan1;
import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		armstrong(num);
		scan.close();
	}
	public static int digitsOfNum(int num) {
		int i=0;
		while (num>0) {
			num/=10;
			i++;
		}
		return i;
	}
	public static int power(int num,int pow) {
		int res =1;
		if(pow==0) {
			res=1;
		}
		else {
			while(pow>0) {
				res*=num;
				pow--;
			}
		}
		return res;
	}
	public static void armstrong(int num) {
		int num2=num;
		int sum=0;
		int digits = digitsOfNum(num);
		while (num>0) {
			int a= num%10;
			sum =sum+(power(a,digits));
			num/=10;
		}
		if(num2==sum) {
			System.out.println("The number "+num2+" is an Armstrong number");
			return;
		}
		else {
			System.out.println("The number "+num2+" is not an Armstrong number");
			return;
		}
	}
}
