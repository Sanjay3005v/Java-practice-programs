package returntype;
import java.util.Scanner;

public class dec26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= scan.nextInt();
		String res = divby4and8(num);
		//String res = endwith4(num);
		//String res = div4and400butnot100(num);
		
		System.out.println(res);
		scan.close();
	}
	public static String divby4and8(int num) {
		boolean	ans = num%4==0 && num%8==0;
		String res = ans?"The number is divisible by 4 and 8":"The number is not divisible by 4 and 8";
		return res;
	}
	public static String endwith4(int num) {
		boolean ans = num%10==4;
		String res = ans?"The number ends with 4":"The number doesn't ends with 4";
		return res;
	}
	public static String div4and400butnot100(int num) {
		boolean ans = num%4==0 && num%400==0 && num%100!=0;
		String res = ans?"The number is divisible by 4 and 400 but not with 100":"The number is not divisible by 4 and 400 but not with 100";
		return res;
	}
}
