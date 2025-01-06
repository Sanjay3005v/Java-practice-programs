package jan3;
import java.util.Scanner;
public class FiboWithRange {
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
			if(num1>=start&&num1<=range) {
				System.out.println(num1);
			}
			res = num1+num2;
			num1=num2;
			num2=res;
		}
	}
}
