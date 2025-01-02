package javaprogram_while;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		DecToBin(num);
		scan.close();
	}
	public static void DecToBin(int num) {
		int num1=num;
		String res ="";
		if(num==0) {
			res="0";
			return;
		}
		while(num1>0) {
			int mod =num1%2;
			num1/=2;
			res = mod+res;
		}
		System.out.println("The decimal to binary of "+num+" is "+ res);
	}
}
