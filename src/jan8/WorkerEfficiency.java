package jan8;
import java.util.Scanner;
public class WorkerEfficiency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter the Time taken to complete the job");
		int time = scan.nextInt();
		Efficiency(time);
	}
	public static void Efficiency(int time) {
		if (time>=2 && time<=3) {
			System.out.println("Highly efficient");
			return;
		}
		else if(time>3 && time <=4) {
			System.out.println("Improve speed");
			return;
		}
		else if(time>4 && time<=5) {
			System.out.println("Training needed to improve speed");
			return;
		}
		else if(time>5) {
			System.out.println("Leave the company");
			return;
		}
	}
}
