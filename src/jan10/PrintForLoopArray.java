// Design a method to print the elements of the array using for each loop.


package jan10;
import java.util.Scanner;
public class PrintForLoopArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		print(a);
		scan.close();
	}
	public static void print(int[] a) {
		for(int i:a) {
			System.out.println(i);
		}
		return;
	}
}
