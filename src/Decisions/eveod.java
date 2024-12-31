package Decisions;

import java.util.Scanner;
public class eveod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		EvenOdd(num);
	}
	public static void EvenOdd(int num) {
		int res=num%2;
		switch(res){
			case 1:{
				System.out.println("The number is Odd");
				break;
			}
			case 0:{
				System.out.println("The number is Even");
				break;
			}
		}
	}
}
