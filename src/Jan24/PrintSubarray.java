// Design a method to print the sub array of the given array.


package Jan24;
import java.util.Scanner;
public class PrintSubarray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size= scan.nextInt();
		int[] a= new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		SubArray(a);
	}
	public static void SubArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}
	}
}
