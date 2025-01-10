// Design a method to right shift the elements of the array in 1

package jan9;
import java.util.Scanner;
public class RightShiftArrayElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		a=rigthshift(a);
		print(a);
		scan.close();
	}
	public static int[] rigthshift(int[] a) {
		int last= a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=last;
		return a;
	}
	public static void print(int[] a) {
		System.out.println("The elements inside the array are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
