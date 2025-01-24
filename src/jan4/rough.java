package jan4;
import java.util.*;
public class rough {
	
	public static void product(int[][] a, int[][] b) {
	    int n = a.length; // Assuming square matrix, so rows = columns
	    int[][] c = new int[n][n]; // Resultant matrix

	    // Perform matrix multiplication
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            for (int k = 0; k < n; k++) {
	                c[i][j] += a[i][k] * b[k][j];
	            }
	        }
	    }

	    // Print the resulting matrix
	    System.out.println("Resultant Matrix:");
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(c[i][j] + " ");
	        }
	        System.out.println();
	    }
	}


	    public static void main(String[] args) {
	        int[][] array = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
	        int[][] b= {{3,2,1},{3,2,1},{3,2,1}};
	        product(array,b);
	    }
	}

