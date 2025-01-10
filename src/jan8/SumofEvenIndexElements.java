package jan8;
import java.util.Scanner;
public class SumofEvenIndexElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a= new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++){
			a[i]=scan.nextInt();
		}
		scan.close();
		sum(a);	
	}
	public static void sum(int[] a) {
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(i%2==0) {
				sum+=a[i];
			}
		}
		System.out.println("The sum of the even indexed elements in the array is "+sum);
	}
}
