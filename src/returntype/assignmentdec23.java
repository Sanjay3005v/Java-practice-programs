package returntype;
import java.util.Scanner;
public class assignmentdec23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the triangle");
		int trilen = scan.nextInt();
		System.out.println("Enter the height of the triangle");
		int trihgt = scan.nextInt();
		System.out.println("Enter the Length of the rectangle");
		int rectlen = scan.nextInt();
		System.out.println("Enter the breadth of th rectangle");
		int rectbrd = scan.nextInt();
		System.out.println("Enter the radius of the circle");
		int radius = scan.nextInt();
		triangle(trilen,trihgt);
		rectangle(rectlen,rectbrd);
		circle(radius);
		
		
	}
	public static void triangle(int l,int h) {
		System.out.println(0.5*l*h);
	}
	public static void rectangle(int l,int b) {
		System.out.println(l*b);
	}
	public static void circle(int r) {
		System.out.println(3.14*r*r);
	}
}
