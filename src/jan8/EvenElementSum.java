package jan8;

public class EvenElementSum {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		even(a);
	}
	public static void even(int[] a) {
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
		}
		System.out.println("The sum of the even elements is "+sum);
	}
}
