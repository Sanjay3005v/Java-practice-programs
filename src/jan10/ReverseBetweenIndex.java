// Design a method to reverse the element of an array between two index values.


package jan10;
import java.util.Scanner;
public class ReverseBetweenIndex {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int size = scan.nextInt();
			int[] a = new int[size];
			System.out.println("Enter the elements of the array");
			for(int i=0;i<size;i++) {
				a[i]= scan.nextInt();		
				}
			System.out.println("Enter the starting index");
			int start=scan.nextInt();
			System.out.println("Enter the ending index");
			int end=scan.nextInt();
			a=reverse(a,start,end);
			System.out.println("After reversing");
			print(a);
			scan.close();
	}
	public static int[] reverse(int[] a,int start,int end) {
		for(int i=start;i<=end;i++) { 
			int sum=0;
			while(a[i]>0) {
			int rem=a[i]%10;
			sum=sum*10+rem;
			a[i]/=10;
			}
			a[i]=sum;
		}
		return a;
	}
	public static void print(int[] a) {
		for(int i:a) {
			System.out.println(i);
		}
		return;
	}
}
