// Design a method to find addition of all the major diagonal elements of a square matrix.


package Jan22;

public class PrintDiagonalOfSquareMatrix {
	public static void main(String[] args) {
		int[][] a= {{3,11,6},{1,2,3},{1,1,2}};
		int sum =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
		System.out.println("The sum of all the diagonal elements in the square matrix is "+sum);
	}
}
