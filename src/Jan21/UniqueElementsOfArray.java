//Design a method to find unique elements or distinct elements in the array.


package Jan21;
import java.util.*;
public class UniqueElementsOfArray {
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
		distinctelements(a);
	}
	public static void distinctelements(int[] a) {
		System.out.println("The distinct elements are");
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					count++;
					a[j]=Integer.MAX_VALUE;
				}
			}
			if(count==1&&a[i]!=Integer.MAX_VALUE) {
				System.out.println(a[i]);
			}
		}
	}
}
