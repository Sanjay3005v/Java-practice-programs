//Design a method to find second minimum value in the array.


package Jan20;
import java.util.*;
public class SecondMinInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		int min2=Min2(a);
		scan.close();
		System.out.println("The Second minimum is "+min2);
	}
	public static int Min2(int[] a) {
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min2=min;
				min=a[i];
			}
			else if(min2>a[i]&& min!=a[i]) {
				min2=a[i];
			}
		}
		return min2;
	}
}
