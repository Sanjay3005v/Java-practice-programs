//Design a method to find addition of all the elements in the individual row of the matrix.


package Jan22;

public class SumRowElements {
	public static void main(String[] args) {
		int[][] a= {{3,11,6},{1,2,3},{1,1,2}};
		for(int i=0;i<a.length;i++) {
			System.out.print("The sum of elements in row "+i+" is ");
			int sum =0;
			for(int j=0;j<a[i].length;j++){
					sum+=a[i][j];
			}
			System.out.println(sum);
		}
	}
}
