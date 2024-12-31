package Decisions;
import java.util.Scanner;
public class discount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the price");
		int price = scan.nextInt();
		double Discount =discountprice(price);
		System.out.println("The final price is "+(price-Discount));
	}
	public static double discountprice(int price) {
		if (price>1000 && price<3000) {
			double dis=price*0.1;
			return dis;
		}
		else if (price>=3000 && price<6000) {
			double dis=price*0.2;
			return dis;
		}
		else if(price >=6000) {
			double dis=price*0.4;
			return dis;
		}
		else {
			double dis=0;
			return dis;
		}		
	}
}
