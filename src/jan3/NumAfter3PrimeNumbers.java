package jan3;

import java.util.Scanner;

public class NumAfter3PrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting");
		int start = scan.nextInt();
		System.out.println("Enter the range");
		int range=scan.nextInt();
		System.out.println("The prime numbers are");
		Primenumberrange(start,range);
		scan.close();
	}
	public static void Primenumberrange(int start,int range) {
		for(int i=start;i<=range;i++) {
			if(Primenumber(i-3)!=true&&Primenumber(i-2)!=true&&Primenumber(i-1)!=true&&Primenumber(i)==true){
				System.out.println(i);
			}
		}
	}
	public static boolean Primenumber(int num) {
		if (num<=1) {
			return false;
		}
		for(int i=2;i<(num-1);i++) {
			if(num%i==0) {
				return false;
			}
			if(num==2) {
				return true;
			}
		}
		return true;
		
	}
}
