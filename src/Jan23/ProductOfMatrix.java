//Design a method to find all the missing elements present in the range of minimum and maximum value of the array.


package Jan23;
import java.util.Scanner;
public class ProductOfMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int size= scan.nextInt();
		int[][] a= new int[size][size];
		System.out.println("Enter the first Matrix elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		int[][] b= new int[size][size];
		System.out.println("Enter the second Matrix elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				b[i][j]=scan.nextInt();
			}
		}
		scan.close();
		product(a,b);
	}
	public static void product(int[][] a,int[][] b ) {
		int[][] c=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
