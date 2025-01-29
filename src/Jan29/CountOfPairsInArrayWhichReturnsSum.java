//Design a method to return the count of pair of elements in the array which returns the given sum and find the pair 
//whose product is the maximum.


package Jan29;
import java.util.Scanner;
public class CountOfPairsInArrayWhichReturnsSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		System.out.println("Enter the array elements");
		int[] a = new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the target sum");
		int target=scan.nextInt();
		scan.close();
		count(a,target);
	}
	public static void count(int[] a,int target) {
		int count=0;
		int max1=0;
		int max2=0;
		int prod=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					count++;
					if(a[i]*a[j]>prod) {
						max1=a[i];
						max2=a[j];
					}
				}
			}
		}
		System.out.println("The number of pairs which return the sum are "+count);
		System.out.println("The elements with maximum product are "+max1+" and "+max2);
	}
}
