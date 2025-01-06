package jan2;
import java.util.Scanner;
public class sunnynumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		SunnyNum(num);
		scan.close();
	}
	public static void SunnyNum(int a) {
		int num=a+1;
		int i=0;
		while(i*i<num) {
			i++;
		}
			if(i*i==num) {
				System.out.println("The number "+a+" is a sunny number");
				return;
			}
			else {
				System.out.println("The number is "+a+" not a perfect square");
			}	
	}
}	