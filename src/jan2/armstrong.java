package jan2;
import java.util.Scanner;
public class armstrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		armstrongNum(num);
		scan.close();
	}
	public static void armstrongNum(int num) {
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
			System.out.println("The number is a Armstrong number ");
		}
		else{
			System.out.println("The number is not a armstrong number");
		}
	}
}
