package jan1;
import java.util.Scanner;
public class SumOfEvenNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int num = scan.nextInt();
		Sumofevennumbers(num);
		scan.close();
	}
	public static void Sumofevennumbers(int num) {
		int sum=0;
		int i=1;
		while (i<=num) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
			}
		System.out.println("The sum of even number in the range of 1 to "+num+" is "+sum);
		}
	}

