//Design a method to find second maximum value in the array.


package Jan20;
import java.util.*;
public class SecondMaxInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		int max2=Max2(a);
		scan.close();
		System.out.println("The Second maximum is "+max2);
	}
	public static int Max2(int[] a) {
		int max=a[0];
		int max2=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max2=max;
				max=a[i];
			}
		}
		return max2;
	}
}
