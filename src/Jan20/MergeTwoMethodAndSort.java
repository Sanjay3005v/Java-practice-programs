//Design a method to merge two arrays in sorted and copy the elements inside third array.(important) 


package Jan20;
import java.util.*;
public class MergeTwoMethodAndSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the first array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		System.out.println("Enter the size of the second array");
		size = scan.nextInt();
		int[] b = new int[size];
		System.out.println("Enter the elements of the second array");
		for(int i=0;i<size;i++) {
			b[i]= scan.nextInt();
		}
		scan.close();
		merge(a,b);
	}
	public static void merge(int[] a,int[] b) {
		int[] c= new int[a.length+b.length];
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) 
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length) 
			c[k++]=a[i++];
		while(j<b.length) 
			c[k++]=b[j++];
		System.out.println(Arrays.toString(c));
	}
}

