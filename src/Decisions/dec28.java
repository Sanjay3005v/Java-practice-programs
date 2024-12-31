package Decisions;

import java.util.Scanner;
public class dec28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		char res=scan.next().charAt(0);
		System.out.println(res);
		checkchar(res);
		
	}
	public static void checkchar(int res) {
		if((res<='A'&&res>='Z')||(res<='a'&&res>='z')){
			System.out.println("Alphabet");
		}
		else if(res>='0'&&res<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special character");
		}
	}

}
