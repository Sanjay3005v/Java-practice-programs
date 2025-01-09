package jan9;
import java.util.Scanner;
public class PrintArray {
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
		System.out.println("The elements inside the array are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
