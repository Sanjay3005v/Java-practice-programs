package jan10;
import java.util.Scanner;
public class SortBetweenIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		System.out.println("Enter the starting index");
		int start=scan.nextInt();
		System.out.println("Enter the ending index");
		int end=scan.nextInt();
		a=sort(a,start,end);
		System.out.println("After sorting");
		print(a);
		scan.close();
	}
	public static int[] sort(int[] a,int start,int end) {
		for(int i=start;i<=end;i++) {
			for(int j=0;j<end;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	public static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
