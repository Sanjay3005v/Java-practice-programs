package jan3;
import java.util.Scanner;
public class ArmstrongNumInRange {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of armstrong numbers");
		int range = scan.nextInt();
		armstrongRange(range);
	}
	public static void armstrongRange(int range) {
		int count=0;
		System.out.println("The Armstrong numbers in the range are");
		for(int i=0;range>=count;i++) {
			if(armstrong(i)) {
				System.out.println(i);
				count++;
			}
		}
		return;
	}
	public static boolean armstrong(int num) {
		int temp =num;
		int sum=0;
		int digits=0;
		int num1 = num;
		while(num>0) {
			num/=10;
			digits++;
		}
		while(temp>0) {
			int a=temp%10;
			int prod =1;
			for (int i = 0; i < digits; i++) {
                prod *= a;
            }
			sum+=prod;
			temp/=10;
		}
		if(sum==num1){
			return true;
		}
		else{
			return false;
		}
	}
}
