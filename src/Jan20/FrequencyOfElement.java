//Design a method to find frequency of a element of the array.


package Jan20;
import java.util.Scanner;
public class FrequencyOfElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]= scan.nextInt();
		}
		System.out.println("Enter the element to find frequency");
		int x= scan.nextInt();
		frequency(a,x);
		scan.close();
	}
	private static void frequency(int[] a,int x) {
		int count = 0;
		for(int i:a) {
			if(i==x) {
				count++;
			}
		}
		System.out.println("The frequency of the element "+x+" is "+count);
		return;
	}
}
