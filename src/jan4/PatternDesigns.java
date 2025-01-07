package jan4;
import java.util.Scanner;
public class PatternDesigns {
	public static void main(String[] args) {
		System.out.println("Select the pattern by selecting a number from 1 to 12");
		Scanner scan = new Scanner(System.in);
		int choice =scan.nextInt();
		scan.close();
		switch (choice) {
		case 1: {
			pattern1();
			break;
			}
		case 2:{
			pattern2();
			break;
			}
		case 3:{
			pattern3();
			break;
			}
		case 4:{
			pattern4();	
			break;
			}
		case 5:{
			pattern5();	
			break;
			}
		case 6:{
			pattern6();	
			break;
			}
		case 7:{
			pattern7();	
			break;
			}
		case 8:{
			pattern8();	
			break;
			}
		case 9:{
			pattern9();	
			break;
			}
		case 10:{
			pattern10();	
			break;
			}
		case 11:{
			pattern11();
			break;
		}
		case 12:{
			pattern12();
			break;
		}
		}
	}
	public static void pattern1() {
		int num=5;
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=num;col++) {
				if(row==3 && col== 3) {
					System.out.print(" # ");
				}
				else if(row==3||col==3) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
	}
	public static void pattern2() {
		int num=3;
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=2*num-1;col++) {
				if(col<=row || col+row>=num*2) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern3() {
		int num=3;
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=2*num-1;col++) {
				if(col+row<=num+1 || col-row>=num-1) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern4() {
		int num=5;
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=num;col++) {
				if(row<=3&&(col<=row || col+row>=num+1)) {
					System.out.print(" * ");
				}
				else if(row>=3&&(col+row<=num+1 || col>=row)) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern5() {
		int num=5;
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=num;col++) {
				if(row<=3 && (col+row>3 && col-row<=2)) {
					System.out.print(" * ");
				}
				else if(row>=3 && ( col-row>=-2 && col+row<=8)) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern6() {
			int num=5;
			for(int row=1;row<=num;row++) {
				for(int col=1;col<=num;col++) {
					if(row==3 &&(col>=2 &&col<=4)||col==3 &&(row>=2 &&row<=4) ) {
						System.out.print("   ");
					}
					else {
						System.out.print(" * ");
					}
				}
				System.out.println();
			}
		}
		public static void pattern7() {
			int num=3;
			char ch='A';
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=5;col++) {
					if(row==col) {
						System.out.print(" "+ch++);
					}
					else if(row==1){
						System.out.print(" "+num++);
					}
					else {
						System.out.print(" "+(col+2));
					}
				}
				System.out.println();
			}
		}
		public static void pattern8() {
			int num=1;
			for(int row=1;row<=4;row++) {
				for(int col=1;col<=4;col++) {
					if(row>=col) {
						System.out.print(" "+num++);
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		public static void pattern9() {
			for(int row=1;row<=4;row++) {
				for(int col=1;col<=4;col++) {
					if(row>=col) {
						System.out.print(" "+col);
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		public static void pattern10() {
			char ch='A';
			for(int row=1;row<=4;row++) {
				for(int col=1;col<=4;col++) {
					if(row>=col) {
						if(row%2==0) {
						System.out.print(" "+col);
						}
						else {
							System.out.print(" "+ch++);
						}
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		public static void pattern11() {
			char ch='A';
			int num=1;
			for(int row=1;row<=4;row++) {
				for(int col=1;col<=4;col++) {
					if(row>=col) {
						if(row%2==0) {
						System.out.print(" "+ch++);
						}
						else {
							System.out.print(" "+num++);
						}
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		public static void pattern12() {
			char ch='A';
			for(int row=1;row<=4;row++) {
				for(int col=1;col<=4;col++) {
					if(row>=col) {
						System.out.print(" "+ch++);
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	
}
