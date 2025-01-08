package jan8;
import java.util.Scanner;
public class InputArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		System.out.println("Enter the elements");
		int[] a = new int[size];
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		scan.close();
	}
}
