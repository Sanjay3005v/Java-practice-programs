package returntype;
import java.util.Scanner;
public class UserNamePassword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user name:");
		String name = scan.next();
		System.out.println("Enter the password");
		String Password = scan.next();
		String res = Login(name,Password);
		System.out.println(res);
	}
	public static String Login(String name,String password) {
		boolean ans = (name.equals("admin"))&&(password.equals("root"));
		String res = ans?"Credentials are correct":"Credentials are wrong";
		return res;
	}
}
