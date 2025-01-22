// Design a method to find largest value of the individual row of the matrix.


package Jan22;
public class MaxInRo {
	public static void main(String[] args) {
		int[][] a= {{3,11,6},{1,2,3},{1,1,2}};
		for(int i=0;i<a.length;i++) {
			System.out.print("The maximum of elements in row "+(i+1)+" is ");
			int max =a[i][0];
			for(int j=0;j<a[i].length;j++){
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
