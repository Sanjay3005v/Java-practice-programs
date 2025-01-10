// Design a method to find the addition of second half elements of the array.


package jan8;
import java.util.Scanner;
public class SumOfSecondHalfOfArray {
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
		int sum=0;
		for(int i=half;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("The sum of the second half elements of the array is "+sum);
	}
}
