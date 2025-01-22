//Design a method to print all the array size present inside 2d array.


package Jan22;

public class SizeOf2DArray {
	public static void main(String[] args) {
		int[][] a= {{3,2},{4,1,5},{3,11}};
		for(int i=0;i<a.length;i++) {
				System.out.println(a[i].length);
		}
	}
}
