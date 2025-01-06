package jan4;
import java.util.Scanner;
public class Patterns {
	public static void main(String[] args) {
		System.out.println("Select the pattern");
		System.out.println("1.Cross");
		System.out.println("2.X");
		System.out.println("3.I");
		System.out.println("4.Box");

		Scanner scan = new Scanner(System.in);
		int choice =scan.nextInt();
		scan.close();
		switch (choice) {
		case 1: {
			Cross();
			break;
		}
		case 2:{
			X();
			break;

		}
		case 3:{
			I();
			break;

		}
		case 4:{
			box();	
			break;
			}
		}
	}
	public static void Cross() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==3||col==3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	public static void X() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==col||row+col==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	public static void I() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1||row==5||col==3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	public static void box() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1||row==5||col==1||col==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	
}

