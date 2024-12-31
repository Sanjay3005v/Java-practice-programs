package Decisions;

import java.util.Scanner;
public class leap_year {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scan.nextInt();
		leapyear(year);
	}
	/*public static void leapyear(int year) {
		if(year%100 == 0) {
			if(year%400 == 0) {
				System.out.println("The given year is a leap year");
				return;
			}
		}		
		else {
			if(year%4 == 0) {
				System.out.println("The given year is a leap year");
				return;
			}
			else {
				System.out.println("The given year is not a leap year");
				return;
			}
		}
		
	}*/
	public static void leapyear(int year) {
		if((year%4==0 && year%100!=0)||year%400==0) {
			System.out.println("The given year is leap year");
			return;
		}
		else {
			System.out.println("The given year is not a leap year");
			return;
		}
		
	}
	

}
