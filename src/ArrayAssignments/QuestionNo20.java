//Find out the avg value from a second half of given int array?


package ArrayAssignments;
import java.util.Scanner;
public class QuestionNo20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		half(a);
		scan.close();
	}
	public static void half(int[] a) {
		int half=a.length/2;
		double sum=0;
		int count=0;
		for(int i=half;i<a.length;i++) {
			sum+=a[i];
			count++;
		}
		double avg=sum/count;
		System.out.println("The average of the second half elements of the array is "+avg);
	}
}
