package Decisions;

import java.util.Scanner;
public class vowcons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = scan.next().charAt(0);
		checkVowCon(ch);
	}
	public static void checkVowCon(char ch) {
		switch (ch) {
		case ('a'):
		case ('e'):
		case ('i'):
		case ('o'):
		case ('u'):
		case ('A'):
		case ('E'):
		case ('O'):
		case ('U'):
		case ('I'):
		
		{
			System.out.println("Vowel");
			break;
		}
		default:
			System.out.println("Consonant");
		}
	}
}
