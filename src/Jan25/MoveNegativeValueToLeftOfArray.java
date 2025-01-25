// Design a method to move all the negative values in the array to the left without changing the order.


package Jan25;
import java.util.*;
public class MoveNegativeValueToLeftOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		System.out.println("Enter the array elements");
		int[] a= new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		negative(a);
	}
	public static void negative(int[] a) {
		int x=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				int temp=a[i];
				for(int j=i;j>x;j--) {
					a[j]=a[j-1];
				}
				a[x]=temp;
				x++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
}
