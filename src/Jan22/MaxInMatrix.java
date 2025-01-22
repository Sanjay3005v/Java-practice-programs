//Design a method to find largest value in the square matrix.


package Jan22;

public class MaxInMatrix {
	public static void main(String[] args) {
		int[][] a= {{3,11,6},{1,2,3},{1,1,2}};
		int max =a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
		}
		System.out.println("The maximum value in the square matrix is "+max);
	}
}
