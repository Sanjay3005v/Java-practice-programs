package Decisions;

import java.util.Scanner;
public class marks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Physics mark");
		double phy = scan.nextDouble();
		System.out.println("Enter the Chemistry mark");
		double chem = scan.nextDouble();
		System.out.println("Enter the Biology mark");
		double bio = scan.nextDouble();
		System.out.println("Enter the Mathematics mark");
		double math = scan.nextDouble();
		System.out.println("Enter the Computer mark");
		double comp = scan.nextDouble();
		grade(phy,chem,bio,math,comp);
	}
	public static void grade(double phy,double chem,double bio,double math,double comp) {
		double Percentage = (phy+chem+bio+math+comp)/5;
		if (Percentage >= 90 && Percentage <= 100) {
			System.out.println("Grade A");
		}
		else if (Percentage >=80) {
			System.out.println("Grade B");
		}
		else if (Percentage >=70) {
			System.out.println("Grade C");
		}
		else if (Percentage >=60) {
			System.out.println("Grade D");
		}
		else if (Percentage >=40) {
			 System.out.println("Grade E");
		}
		else {
			System.out.println("Grade F");
		}
		
	}
}
