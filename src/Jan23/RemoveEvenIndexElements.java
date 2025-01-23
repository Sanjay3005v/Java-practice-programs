//Design a method to remove the even index elements of the array.


package Jan23;
import java.util.Arrays;
import  java.util.Scanner;
public class RemoveEvenIndexElements {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a= new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]= scan.nextInt();
		}
		scan.close();
		int[] b= new int[size/2];
		Removeeven(a,b);
	}
	public static void Removeeven(int[] a,int[] b) {
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				b[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
