package jan1;
import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		squares(num);
		scan.close();
	}
	public static void squares(int num) {
		int i=0;
		while(i*i<num) {
			i++;
		}
			if(i*i==num) {
				System.out.println("The number "+num+" is a perfect square of "+i);
				return;
			}
			else {
				System.out.println("The number is not a perfect square");
			}	
	}
}
