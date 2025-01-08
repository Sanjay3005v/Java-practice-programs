package jan8;
import java.util.Scanner;
public class PrintFirstHalfOjArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		half(a,size);
		scan.close();
		}
	public static void half(int[] a,int size) {
		int half=size/2;
		System.out.println("The first half of the array is");
		for(int i=0;i<half;i++) {
			System.out.println(a[i]);
		}
	}
}
