//Design a method to find frequency of every element of the array.


package Jan21;
import java.util.*;
public class FrequencyOfElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		Frequency(a);
		scan.close();
	}
	public static void Frequency(int[] a){
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					count++;
					a[j]=Integer.MAX_VALUE;
				}
			}
			if(a[i]!=Integer.MAX_VALUE) {
				System.out.println("The frequency of "+a[i]+" is "+count);
			}
		}
	}
}
