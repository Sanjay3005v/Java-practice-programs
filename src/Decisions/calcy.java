package Decisions;

import java.util.Scanner;
public class calcy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the operation from the following");
		System.out.println("For Addition press 1");
		System.out.println("For Subtraction press 2");
		System.out.println("For Mulptiplication press 3");
		System.out.println("For Division press 4");
		System.out.println("For Modulus press 5");
		int operation = scan.nextInt();
		System.out.println("Enter the first operand");
		int a = scan.nextInt();
		System.out.println("Enter the second operand");
		int b = scan.nextInt();
		calculator(a,b,operation);
	}
	public static void calculator(int a,int b,int operation) {
		switch(operation) {
			case 1:{
				System.out.println(a+b);
				break;
			}
			case 2:{
				System.out.println(a-b);
				break;
			}
			case 3:{
				System.out.println(a*b);
				break;
			}
			case 4:{
				System.out.println(a/b);
				break;
			}
			case 5:{
				System.out.println(a%b);
				break;
			}
			}
	}
}
