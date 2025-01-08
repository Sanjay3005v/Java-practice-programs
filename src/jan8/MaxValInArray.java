package jan8;
import java.util.Scanner;
public class MaxValInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a= new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++){
			a[i]=scan.nextInt();
		}
		scan.close();
		max(a,size);
	}
	public static void max(int[] a,int size) {
		int max=a[0];
		for(int i=1;i<size;i++) {
			if(max<=a[i]) {
				max=a[i];
			}
		}
		System.out.println("The maximum value in the array is "+max);
	}
}
