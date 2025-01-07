package jan4;

public class rough {
	public static void main(String[] args) {
		char ch='A';
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				if(row>=col) {
					System.out.print(" "+ch++);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
