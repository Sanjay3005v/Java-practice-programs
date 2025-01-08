package jan8;

public class AverageValueOfArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		average(a);
	}
	public static void average(int[] a) {
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
				sum+=a[i];
		}
		int average=sum/a.length;
		System.out.println("The average of the elements in the array is "+average);
	}
}
