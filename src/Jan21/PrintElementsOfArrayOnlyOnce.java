//Design a method to print all the elements in the array only once.


package Jan21;
import java.util.Scanner;
public class PrintElementsOfArrayOnlyOnce {
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
		Printelements(a);
	}
	public static void Printelements(int[] a) {
		System.out.println("The elements of the array are");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					a[j]=Integer.MAX_VALUE;
				}
			}
		}
		for (int k:a) {
			if(k!=Integer.MAX_VALUE) {
				System.out.println(k);
			}
		}
	}
}
