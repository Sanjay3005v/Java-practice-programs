package jan4;
import java.util.Scanner;
public class SplPatterns {
	public static void main(String[] args) {
			System.out.println("Select the pattern by selecting a number from 1 to 8");
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
			}
		}
		public static void pattern1() {
			int num=1;
			for(int row=1;row<=3;row++) {
				for(int col=1;col<=3;col++) {
						System.out.print(num++ +" ");
					}
				System.out.println();
			}
		}
		public static void pattern2() {
			char ch='A';
			for(int row=1;row<=3;row++) {
				for(int col=1;col<=3;col++) {
					System.out.print(ch++ +" ");	
				}System.out.println();
			}
		}
		public static void pattern3() {
			for(int row=1;row<=3;row++) {
				for(int col=1;col<=3;col++) {
					System.out.print(row+" ");
				}System.out.println();
			}
		}
		public static void pattern4() {
			int num=1;
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=5;col++) {
					if(num<=9) {
						System.out.print("0"+ num++ +" ");
					}
					else {
						System.out.print(num++ +" ");
					}
				}System.out.println();
			}
		}
			public static void pattern5() {
				int num=1;
				char ch='A';
				for(int row=1;row<=3;row++) {
					for(int col=1;col<=3;col++) {
						if(row==1||row==3) {
							System.out.print(num++ +" ");
						}
						else {
							System.out.print(ch++ +" ");
						}
					}System.out.println();
				}
			}
			public static void pattern6() {
				for(int row=1;row<=3;row++) {
					for(int col=1;col<=3;col++) {
						System.out.print(col+ " ");
					}System.out.println();
				}
			}
			public static void pattern7() {
				char ch='A';
				for(int row=1;row<=3;row++) {
					for(int col=1;col<=3;col++) {
						if(row==1||row==3) {
							System.out.print(col+" ");
						}
						else {
							System.out.print(ch++ +" ");
						}
					}System.out.println();
				}
			}
			public static void pattern8() {
				int num=1;
				char ch='A';
				for(int row=1;row<=3;row++) {
					for(int col=1;col<=3;col++) {
						if(row==1) {
							System.out.print(row+ " ");
						}
						else if(row==2) {
							System.out.print(ch++ +" ");
						}
						else {
							System.out.print(num++ +" ");
						}
					}System.out.println();
				}
			}
	}



