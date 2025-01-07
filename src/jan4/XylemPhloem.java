package jan4;
import java.util.Scanner;
public class XylemPhloem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		XylemPhloenNum(num);
	}
	public static void XylemPhloenNum(int num) {
		int temp=num;
		int last=temp%10;
		int sum=0;
		int sum1=0;
		int rem;
		while(temp>0) {
			if(temp==num||temp<10) {
				sum1=sum1+temp%10;	
			}
			else{
				rem=temp%10;
				sum+=rem;
			}
			temp/=10;
		}
		if(sum==sum1) {
			System.out.println("The givennumber is a Xylem number");
		}
		else {
			System.out.println("The givennumber is a Phloem number");
		}
	}
}
