package javaprogram_while;

import java.util.Scanner;
public class PowerOfNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println("Enter the power");
		int pow = scan.nextInt();
		power(num,pow);
		scan.close();
	}
	public static void power(int num,int pow) {
		int num1=pow;
		long res =1;
		if(pow==0) {
			res=1;
		}
		else {
			while(pow>0) {
				res*=num;
				pow--;
			}
		}
		System.out.println(num+" to the power of "+num1+ " is "+res);
		
	}
}
