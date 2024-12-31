package Decisions;
import java.util.Scanner;
public class uppercase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = scan.next().charAt(0);
		upcase(ch);
	}
	public static void upcase(char ch) {
		
		if (ch>='A' && ch<='Z') {
			System.out.println("The given character is upper case ");
			return;
		}
		else {
			System.out.println("The given character is not upper case ");
			return;
		}
		
	}
}
