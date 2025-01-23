package jan4;
import java.util.*;
public class rough {
	
	    public static void missing(int[] a) {
	        if (a == null || a.length == 0) {
	            System.out.println("Array is empty or null.");
	            return;
	        }

	        // Sort the array
	        Arrays.sort(a);
	        int min = a[0];
	        int max = a[a.length - 1];

	        // Check for missing elements in the range [min, max]
	        for (int j = min; j <= max; j++) {
	            boolean miss = true; // Reset miss for each j
	            for (int i = 0; i < a.length; i++) {
	                if (j == a[i]) {
	                    miss = false; // Found the number, set miss to false
	                    break; // Exit the inner loop
	                }
	            }
	            if (miss) { // If miss is still true, print the missing number
	                System.out.println("The missing element is " + j);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 4, 6, 7, 9};
	        missing(array);
	    }
	}

