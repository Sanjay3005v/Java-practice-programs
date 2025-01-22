//Design a method to show the addition of all the column elements individually in the matrix.


package Jan22;
import java.util.Scanner;
public class SumOfColumnMethod {
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
		scan.close();
		Sum(a);
	}
	public static void Sum(int[][] a) {
		for(int i=0;i<a.length;i++) {
			int sum=0;
			System.out.print("The sum of the column "+(i+1)+" elements is ");
			for(int j=0;j<a[i].length;j++) {
				sum+=a[j][i];
			}
			System.out.println(sum);
		}
	}
}
