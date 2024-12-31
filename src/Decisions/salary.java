package Decisions;

import java.util.Scanner;
public class salary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		double sal= scan.nextInt();
		System.out.println("Enter the joined year");
		int jyear = scan.nextInt();
		
		double newsal=mainsalary(sal);
		double nesal= totsal( newsal, jyear);
		System.out.println("The total salary is "+nesal);
	}
	public static double mainsalary(double sal) {
		double hra=0,da=0,newsal=0;
		if (sal<= 10000) {
			hra= 0.2*sal;
			da= 0.8*sal;
			
		}
		else if(sal<= 20000) {
			hra= 0.25*sal;
			da= 0.9*sal;
			
		}
		else if(sal> 20000) {
			hra= 0.3*sal;
			da= 0.95*sal;
			
		}
		newsal=sal+hra+da;
		return newsal;
		
			
	}
	public static double totsal(double newsal,int jyear) {
		int nyear = 2024-jyear;
		if (nyear>3) {
			newsal+=2500;
			return newsal;
		}
		return newsal;
	}
	
}
