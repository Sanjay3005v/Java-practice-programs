package jan4;

public class rough {
	public static void main(String[] args) {
		char ch='A';
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==col) {
					System.out.print(" "+ch++);
				}
				else {
					System.out.print(" "+(row+col));
				}
			}
			System.out.println();
		}
	}
}
