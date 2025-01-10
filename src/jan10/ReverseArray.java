package jan10;
import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		a=Reverse(a);
		System.out.println("After reversing");
		print(a);
		scan.close();
	}
	public static int[] Reverse(int[] a) {
		int first =0;
		int last =a.length-1;
		while(first<last) {
			int temp=a[first];
			a[first]=a[last];
			a[last]=temp;
			first++;
			last--;
		}
		return a;
	}
	public static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
