package jan4;

public class rough {
	public static void main(String[] args) {
			int num=5;
			for(int row=1;row<=num;row++) {
				for(int col=1;col<=2*num-1;col++) {
					if((col+row>num && col-row<=num-1)) {
						System.out.print(" * ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
}
