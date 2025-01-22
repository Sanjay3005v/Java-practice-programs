/*The function takes two integrals m and n as arguments, You are required to obtain the
  total of all integers ranging between 1 to n (both inclusive) which are not divisible 
  by m. You must also return the distinction between the sum of integers not divisible 
  by m with the sum of integers divisible by m. Assumption m > 0 and n>0 Sum lies within
   the integral range.
   */


package Jan22;
import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int m = scan.nextInt();
		int n = scan.nextInt();
		scan.close();
		sum(m,n);
	}
	public static void sum(int m, int n) {
		int divisible=0;
		int notDivisible=0;
		for(int i=0;i<=n;i++) {
			if(i%m==0) {
				divisible+=i;
			}
			else {
				notDivisible+=i;
			}
		}
		System.out.println(notDivisible-divisible);
	}
}
