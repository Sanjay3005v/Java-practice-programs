package jan4;

import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the pattern");
		int choice=scan.nextInt();
		switch (choice) {
		case 1: {
			pattern1();
			break;
		}
		case 2:{
			pattern2();
			break;

		}
		}
		scan.close();
	}
	public static void pattern1() {
		int num=3;
		int count=1;
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=2*num-1;col++) {
				if(col+row>num && col-row<=num-1) {
					System.out.print(count++ +" " );
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern2() {
		System.out.println("Enter the height of the pyramid");
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		scan.close();
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=2*num-1;col++) {
				if(col+row>num && col-row<=num-1) {
					System.out.print(row+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
