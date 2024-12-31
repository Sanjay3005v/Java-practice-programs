package Decisions;

import java.util.Scanner;
public class vowconif {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = scan.next().charAt(0);
		checkVowCon(ch);
	}
	public static void checkVowCon(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("The given character is a lowercase vowel");
			return;
		}
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("The given character is a uppercase vowel");
			return;
		}
		else {
			System.out.println("The given character is a consonant ");
		}
	}
}	