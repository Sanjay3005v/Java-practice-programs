package jan10;
import java.util.Scanner;
public class RightShiftNoOfTimes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the number of times to rotate the array");
		int count = scan.nextInt();
		rigthshift(a,count);
		scan.close();
	}
	public static void rigthshift(int[] a,int count) {
		for(int j=0;j<count;j++) {
			int last= a[a.length-1];
			for(int i=a.length-1;i>0;i--) {
				a[i]=a[i-1];
			}
			a[0]=last;
			print(a);
		}
	}
	public static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
