//Design a method to find all the missing elements present in the range of minimum and maximum value of the array.


package Jan23;

import java.util.*;
public class AllMissinElementsInTheArray {
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
		missing(a);
	}
	public static void missing(int[] a) {
		Arrays.sort(a);
		int min=a[0];
		int max=a[a.length-1];	
		int i=0;
		while(min<=max&&i<a.length) {
			if(min!=a[i]) {
				System.out.println("The missing element is "+min);
				min++;
				i++;
			}
			else {
				min++;
				i++;
			}		
		}
	}
}
