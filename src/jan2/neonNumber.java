package jan2;
import java.util.Scanner;
public class neonNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		NeonNum(num);
		scan.close();
	}
	public static void NeonNum(int num) {
		int temp=num;
		int sum=0;
		int square = num*num;
		while(square>0) {
			int a=square%10;
            sum+= a;
			square/=10;
		}
		if(sum==temp){
			System.out.println("The number is a Neon number ");
		}
		else{
			System.out.println("The number is not a Neon number");
		}
	}
}
