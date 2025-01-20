//Design a method to remove the given element from the array.


package Jan20;
import java.util.*;
public class DeleteElementOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		System.out.println("Enter the element to delete");
		int x= scan.nextInt();
		a=delete(a,x);
		scan.close();
		System.out.println("The array after deleting the element is ");
		System.out.println(Arrays.toString(a));
	}
	public static int[] delete(int[] a,int x) {
		int count = 0;
		for(int i:a) {
			if(i==x) {
				count++;
			}
		}
		int[] b  = new int[a.length-count];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=x) {
				b[j]=a[i];
				j++;
			}
		}
		return b;
	}
}
