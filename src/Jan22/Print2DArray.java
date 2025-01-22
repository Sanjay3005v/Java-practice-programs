//Design a method to print all the elements of a 2d array.

package Jan22;

public class Print2DArray {
	public static void main(String[] args) {
		int[][] a= {{3,2},{4,1,5},{3,11}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
