package Decisions;
import java.util.Scanner;
public class dayOfTheWeek {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		days(num);
	}
	public static void days(int num) {
		switch(num) {
		case 1:{
			System.out.println("Sunday");
			break;
		}
		case 2:{
			System.out.println("Monday");
			break;
		}
		case 3:{
			System.out.println("Tuesday");
			break;
		}
		case 4:{
			System.out.println("Wednesday");
			break;
		}
		case 5:{
			System.out.println("Thursday");
			break;
		}
		case 6:{
			System.out.println("Friday");
			break;
		}
		case 7:{
			System.out.println("Saturday");
			break;
		}
		}
	}
}
