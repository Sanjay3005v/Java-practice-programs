package jan2;
import java.util.Scanner;
public class happynumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		HappyNum(num);
		scan.close();
	}public static int sum(int num) {
		
		int temp=num;
		int sum =0;
		int prod=1;
		while(temp>0) {
			int a=temp%10;
			temp/=10;
			prod=a*a;
			sum+=prod;
		}
		return sum;
	}
	public static void HappyNum(int num) {
		int temp=num;
		int res1=num;
		while(res1!=1 && res1!=4){
		res1=sum(num);
		num=res1;
		}
		if(num==1) {
			System.out.println("The number "+temp+" is a Happy number");
			return;
		}
		else {
			System.out.println("The number "+temp+" is not a Happy number");
			return;
		}
	}
}
