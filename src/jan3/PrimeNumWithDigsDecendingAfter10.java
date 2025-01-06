package jan3;
import java.util.Scanner;
public class PrimeNumWithDigsDecendingAfter10 {
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
			if(Primenumber(i)) {
				int rem;
				int temp=i;
				int pre=0;
				boolean num=true;
				while(temp>0) {
					rem=temp%10;
					temp/=10;
					if(rem<=pre) {
						num=false;
						break;
					}
					pre=rem;
				}
				if(num) {
					System.out.println(i);
				}
			}
		}
		
	}public static boolean Primenumber(int num) {
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
