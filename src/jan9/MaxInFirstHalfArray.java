// Design a method to find the output maximum value in the first half of the array.



package jan9;
import java.util.Scanner;
public class MaxInFirstHalfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		half(a);
		scan.close();
		}
	public static void half(int[] a) {
		int half=a.length/2;
		int temp=a[0];
		for(int i=0;i<half;i++) {
			if(temp<a[i]) {
				temp=a[i];
			}
		}
		System.out.println("The maximum value in the first half of the array is "+temp);
	}
}
