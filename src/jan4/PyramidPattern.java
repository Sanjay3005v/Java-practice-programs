package jan4;
import java.util.Scanner;
public class PyramidPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height of the pyramid");
		int num =scan.nextInt();
		Pyramid(num);
		scan.close();
	}
	public static void Pyramid(int num) {
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=2*num-1;col++) {
				if(col+row>num && col-row<=num-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
