//Read all the elements of the array in the reverse order


package ArrayAssignments;
import java.util.Scanner;
public class QuestionNo21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		reverse(a);
		scan.close();
	}
	public static void reverse(int[] a) {
		System.out.println("The elements of the array in reverse order are");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
