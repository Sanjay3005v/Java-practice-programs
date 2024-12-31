package Decisions;
import java.util.Scanner;
import java.lang.Math;
public class RootsOfQuad {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the coefficient of a");
		double a= scan.nextDouble();
		System.out.println("Enter the coefficient of b");
		double b= scan.nextDouble();
		System.out.println("Enter the coefficient of c");
		double c= scan.nextDouble();
		roots(a,b,c);
	}
	public static void roots(double a,double b,double c) {
		double x= b*b -(4*a*c);
		if (x<0) {
			double x1 =-x;
			double num = (-b)/(2*a);
			String num1 =((Math.sqrt(x1))/(2*a))+"i";
			System.out.println(num+"+"+num1);
			String num2 =((Math.sqrt(x1))/(2*a))+"i";
			System.out.println(num+"-"+num2);
			return;
		}
		else if (x>0) {
			double num = (-b - Math.sqrt(x))/(2*a);
			System.out.println(num);
			double num2 = (-b + Math.sqrt(x))/(2*a);
			System.out.println(num2);
			return;
			
		}
		else {
			double num = (-b )/(2*a);
			System.out.println(num);
			return;
			
		}
	}

}
