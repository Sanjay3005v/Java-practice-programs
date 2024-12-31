package Decisions;

import java.util.Scanner;

public class triangle_angle {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the first angle:");
	int a = scan.nextInt();
	System.out.println("Enter the second angle:");
	int b = scan.nextInt();
	System.out.println("Enter the third angle:");
	int c = scan.nextInt();
	triangle(a,b,c);
}

public static void triangle(int a,int b,int c) {
	if(a+b+c == 180) {
		System.out.println("The given angles form a triangle");
		return;
	}
	else {
		System.out.println("The given angles does not form a triangle");
		return;
	}
}
}