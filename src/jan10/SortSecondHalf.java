// Design a method reverse the second half elements of the array.


package jan10;
import java.util.Scanner;
public class SortSecondHalf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		a=sort(a);
		System.out.println("After sorting");
		print(a);
		scan.close();
	}
	public static int[] sort(int[] a) {
		for(int i=a.length/2;i<a.length;i++) {
			for(int j=a.length/2;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	public static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
