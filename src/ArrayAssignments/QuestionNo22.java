// Read first half of the elements in the reverse direction from an array?

package ArrayAssignments;
import java.util.Scanner;
public class QuestionNo22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		half(a);
		scan.close();
	}	
	public static void half(int[] a) {
		int half=a.length/2;
		System.out.println("The first half of the array in rverse order is");
		for(int i=half-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
