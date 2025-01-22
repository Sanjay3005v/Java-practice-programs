//Design a method to print all the even values in the matrix.


package Jan22;

public class EvenElementsOfMatrix {
	public static void main(String[] args) {
		int[][] a= {{3,2},{4,1,5},{3,11}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]%2==0) {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
