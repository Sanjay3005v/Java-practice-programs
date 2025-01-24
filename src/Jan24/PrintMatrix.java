//Design a method to print all the elements of the matrix using for each loop.


package Jan24;
import java.util.Scanner;
public class PrintMatrix {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int size= scan.nextInt();
		int[][] a= new int[size][size];
		System.out.println("Enter the Matrix elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		scan.close();
		print(a);
	}
	public static void print(int[][] a) {
		for(int[] i:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		return;
	}
}
