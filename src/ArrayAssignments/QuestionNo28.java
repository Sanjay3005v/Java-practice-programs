//Find out an index of a specified element from a given array?


package ArrayAssignments;
import java.util.Scanner;
public class QuestionNo28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		System.out.println("Enter the element to search");
		int x= scan.nextInt();
		search(a,x);
		scan.close();
	}
	public static void search(int[] a,int x) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				System.out.println("The element is in the index "+i);
				return;
			}
			else {
			System.out.println("The element is not in the array");
			}
		}
	}
}
