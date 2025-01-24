//Design a method to find the smallest value in every column of the matrix.

package Jan24;
import java.util.Scanner;
public class SmallestElementInColumn {
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
		smallest(a);
	}
	public static void smallest(int[][] a) {
		for(int i=0;i<a.length;i++) {
			int min=a[0][i];
			for(int j=0;j<a[i].length;j++) {
				if(a[j][i]<min) {
					min=a[j][i];
				}
			}
			System.out.println("The smallest element in the column "+(i+1)+" is "+min);
		}
	}
}
