package Decisions;
import java.util.Scanner;
public class diff30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		diff(num);
		}
	public static void diff(int num) {
		int dif =30-num;
		if(dif>=0) {
			System.out.println(30);
			return;
		}
		else {
			System.out.println(num*3);
			return;
		}
	}
}
