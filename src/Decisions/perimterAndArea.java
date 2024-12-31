package Decisions;

import java.util.Scanner;
public class perimterAndArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int len = scan.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int br = scan.nextInt();
		int per= perimeter(len,br);
		int ar= area(len,br);
		greatest(per,ar);
	}
	public static int perimeter(int len, int br) {
		int per = 2*(len+br);
		return per;
	}
	public static int area(int len, int br) {
		int ar = len*br;
		return ar;
	}
	public static void greatest(int per, int ar) {
		if (per<ar) {
			System.out.println("Area is greater than perimeter");
			return;
		}
		else if(ar<per) {
			System.out.println("Perimeter is greater than area");
			return;
		}
		else {
			System.out.println("Perimeter is equal to area");
			return;
		}
	}
}

