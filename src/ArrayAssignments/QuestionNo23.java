//Read second half of the elements in the reverse direction from an array

package ArrayAssignments;
import java.util.Scanner;
public class QuestionNo23 {
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
		System.out.println("The second half of the array in reverse order is ");
		for(int i=a.length-1;i>=half;i--) {
			System.out.println(a[i]);
		}
	}
}
