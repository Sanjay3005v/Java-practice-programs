//Design a method to find the product of all the minor diagonal elements from a matrix .


package Jan24;
import java.util.Scanner;
public class ProductOfMinorDiagonal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
	}
	public static void name() {
		
	}
}
