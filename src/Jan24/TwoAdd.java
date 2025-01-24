//Design a method to find the elements which gives the sum of given input value from the array.
//(return two elements whose sum is the given input value).


package Jan24;
import java.util.Scanner;
public class TwoAdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int size= scan.nextInt();
		System.out.println("Enter the sum");
		int sum = scan.nextInt();
		int[] a= new int[size];
		System.out.println("Enter the Array elements");
		for(int i=0;i<a.length;i++){
				a[i]=scan.nextInt();
		}
		scan.close();
		sumAns(a,sum);
	}
	public static void sumAns(int[] a, int sum) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println("The Array index which give the sum "+sum+" are "+i+","+j);
					break;
				}
			}
		}
	}
}
