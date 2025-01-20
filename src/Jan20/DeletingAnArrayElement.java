//Design a method to remove an element of the array from the given index.



package Jan20;
import java.util.*;
public class DeletingAnArrayElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		System.out.println("Enter the index of the element to delete");
		int x= scan.nextInt();
		a=delete(a,x);
		scan.close();
		System.out.println("The array after deleting the element is ");
		System.out.println(Arrays.toString(a));
	}
	public static int[] delete(int[] a,int x) {
		int[] b  = new int[a.length-1];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(i!=x) {
				b[j]=a[i];
				j++;
			}
		}
		return b;
	}
}
