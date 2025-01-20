//Design a method to reverse only the even indexed elements.

package jan10;
import java.util.Scanner;
public class reverseEvenIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		a=reverse(a);
		System.out.println("After reversing the even indexed elements the array");
		print(a);
		scan.close();
	}
	public static int[] reverse(int[] a) {
		for(int i=0;i<a.length;i++) { 
			if (i%2==0) {
				int sum=0;
				while(a[i]>0) {
					int rem=a[i]%10;
					sum=sum*10+rem;
					a[i]/=10;
					}
				a[i]=sum;
				}
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
