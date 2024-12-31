package returntype;
import java.util.Scanner;
public class prog1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Ascii value");
		int num=scan.nextInt();
		char res=Ascii(num);
		System.out.println("The Character is "+res);
	}
	public static char Ascii(int num) {
		
		return (char)num;
	}

}
