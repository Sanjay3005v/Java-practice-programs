package javaprogram_while;

public class AlphabetsWithAscii {
	public static void main(String[] args) {
		char ch1 = 'a';
		char ch2 = 'A';
		while(ch2<='Z') {
			System.out.println(ch2+" = "+(int)ch2);
			ch2++;
		}
		while(ch1<='z') {
			System.out.println(ch1+" = "+(int)ch1);
			ch1++;
		}
	}
}
