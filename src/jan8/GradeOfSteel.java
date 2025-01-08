package jan8;
import java.util.Scanner;
public class GradeOfSteel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the hardness");
		int hardness = scan.nextInt();
		System.out.println("Enter the Carbon content");
		double carbon = scan.nextDouble();
		System.out.println("Enter the tensile strength");
		int strength = scan.nextInt();
		grade(hardness,carbon,strength);
		scan.close();
	}
	public static void grade(int a,double b,int c) {
		if(a>50 && b<0.7 && c>5600) {
			System.out.println("Grade is 10");
			return;
		}
		else if (a>50 && b<0.7 && c<=5600) {
			System.out.println("Grade is 9");
			return;

		}
		else if(a>50 && b<=0.7 && c>5600) {
			System.out.println("Grade is 8");
			return;

		}
		else if(a>50 || b<0.7 || c>5600) {
			System.out.println("Grade is 7");
			return;
		}
		else {
			System.out.println("Grade is 5");
			return;
		}
	}
}
