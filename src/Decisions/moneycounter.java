package Decisions;
import java.util.Scanner;
public class moneycounter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		int num = scan.nextInt();
		amtcal(num);
	}
	public static void amtcal(int num) {
		int res = 0,amount=num;
		if (amount>=2000) {
			int money2000 = num/2000;
			amount-=(money2000*2000);
			res+=money2000;
			System.out.println("The number of 2000 rupees note is "+money2000);
			
		}
		if (amount>=500) {
			int money500 = amount/500;
			amount-=(money500*500);
			res+=money500;
			System.out.println("The number of 500 rupees note is "+money500);
		}
		if (amount>=200) {
			int money200 = amount/200;
			amount-=(money200*200);
			res+=money200;
			System.out.println("The number of 200 rupees note is "+money200);
		}
		if (amount>=100) {
			int money100 = amount/100;
			amount-=(money100*100);
			res+=money100;
			System.out.println("The number of 100 rupees note is "+money100);
		}
		if (amount>=50) {
			int money50 = amount/50;
			amount-=(money50*50);
			res+=money50;
			System.out.println("The number of 50 rupees note is "+money50);
		}
		if (amount>=20) {
			int money20 = amount/20;
			amount-=(money20*20);
			res+=money20;
			System.out.println("The number of 20 rupees note is "+money20);
		}
		if (amount>=10) {
			int money10 = amount/10;
			amount-=(money10*10);
			res+=money10;
			System.out.println("The number of 10 rupees note is "+money10);
		}
		System.out.println("The total number of is "+res);
	}
}
