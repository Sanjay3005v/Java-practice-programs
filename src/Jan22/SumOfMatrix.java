//Design a method to add the elements of two matrix and store the result in third matrix.(for square matrix)


package Jan22;
import java.util.Scanner;
public class SumOfMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns");
		int col = scan.nextInt();
		int[][] a= new int[row][col];
		System.out.println("Enter the elements of the first matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		int[][] b= new int[row][col];
		System.out.println("Enter the elements of the second matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=scan.nextInt();
			}
		}
		int[][] c= new int[row][col];
		scan.close();
		sum(a,b,c);
		print(c);
	}
	public static void sum(int[][] a,int[][] b,int[][] c) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
	}
	public static void print(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		return;
	}
}
