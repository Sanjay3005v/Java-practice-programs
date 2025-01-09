//Swap two given indexed elements from the array?


package ArrayAssignments;
import java.util.Scanner;
public class QuestionNo29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		System.out.println("Before swapping");
		print(a);
		System.out.println("Enter the indexes you want to swap");
		int x=scan.nextInt();
		int y=scan.nextInt();
		a= swap(a,x,y);
		System.out.println("After swapping");
		print(a);
		scan.close();
	}
	private static int[] swap(int[] a,int x,int y) {
		int temp;
		temp=a[x];
		a[x]=a[y];
		a[y]=temp;
		return a;
		
	}
	public static void print(int[] a) {
		System.out.println("The elements inside the array are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
