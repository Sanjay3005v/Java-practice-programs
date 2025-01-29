// Write a java program to count the number of sub arrays the sum of target element.


package Jan29;
import java.util.Scanner;
public class subArraySum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a= new int[size];
		System.out.println("Enter the arary elements");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the target sum");
		int target= scan.nextInt();
		scan.close();
		Subarray(a,target);
	}
	public static void Subarray(int[]a,int target) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				sum+=a[j];
			}
			if(sum==target) {
				count++;
			}
		}
		System.out.println("The count is "+count);
	}
}
