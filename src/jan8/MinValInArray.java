package jan8;
import java.util.Scanner;
public class MinValInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		min(a,size);
	}
	public static void min(int[] a,int size) {
		int min=a[0];
		for(int i=1;i<size;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("The minimum value in the array is "+min);
	}
}
