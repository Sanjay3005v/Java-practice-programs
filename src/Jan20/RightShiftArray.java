// Design a method to right shift the elements of the array in 1.(important)


package Jan20;
import java.util.Scanner;
public class RightShiftArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		a=Rightshift(a);
		System.out.println("After right shifting array");
		print(a);
		scan.close();
	}
	public static int[] Rightshift(int[] a) {
		int temp = a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		return a;
	}
	public static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
