//Design a method to copy the elements if one matrix into another matrix.


package Jan22;
import java.util.Scanner;
public class CopyMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns");
		int col = scan.nextInt();
		int[][] a= new int[row][col];
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		int[][] b= new int[row][col];
		scan.close();
		b=copy(a,b);
		print(b);
	}
	public static int[][] copy(int[][] a,int[][] b) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=a[i][j];
			}
		}
		return b;
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
