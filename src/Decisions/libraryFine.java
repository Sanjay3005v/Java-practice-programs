package Decisions;

import java.util.Scanner;
public class libraryFine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of days late");
		int num = scan.nextInt();
		fine(num);
	}
	public static void fine(int num) {
		
		switch (num) {
		case 0: {
			System.out.println("There is no fine");
			break;
		}
		case 1,2,3,4,5:{
			System.out.println("Fine is " +0.5*num+ "rupees");
			break;
		}
		case 6,7,8,9,10:{
			System.out.println("Fine is "+num+ " rupee");
			break;
		}
		default:
			System.out.println("Fine is "+5*num+ "rupees");
			System.out.println("Your membership is cancelled");
			break;
		}
	}
}
