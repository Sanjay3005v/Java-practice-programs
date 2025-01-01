package javaprogram_while;

public class Divby3and5 {
	public static void main(String[] args) {
		divisible();
	}
	public static void divisible() {
		int i =0;
		while(i<=50) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
			i++;
		}
		return;
	}
	
}
