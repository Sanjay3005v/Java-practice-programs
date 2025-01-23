// Design a method to find the missing element in the array.


package Jan23;
import java.util.*;
public class MissingElementInArray {
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
		for(int i=0;i<a.length&&min<=max;i++) {	
			if(min!=a[i]) {
				System.out.println("The missing element is "+min);
				break;
			}
			else {
				min++;
			}
		}
	}
}
