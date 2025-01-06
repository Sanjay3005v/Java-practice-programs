package jan3;

public class Pattern {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1 || row==5 || col==3) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
