//Design a method to print duplicate elements in the array.


package Jan21;
import java.util.Scanner;
public class DuplicateElementsInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		System.out.println("Enter the array elements");
		int[] a=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		duplicate(a);
	}
	public static void duplicate(int[] a) {
		System.out.println("The duplicate elements are");
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					count++;
					a[j]=Integer.MAX_VALUE;
				}
			}
			if(count!=1&&a[i]!=Integer.MAX_VALUE) {
				System.out.println(a[i]);
			}
		}
	}
}
