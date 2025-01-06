package jan3;

public class PrimeNumB4MulOf10 {
	public static void main(String[] args) {
		System.out.println("The Prime numbers which are immediately before the multiples of 10 and below 200 are");
		for(int i=1;i<=200;i++) {
			if (i%10==9 && Primenumber(i)) {
				System.out.println(i);
			}
		}
		return;
	}
	public static boolean Primenumber(int num) {
		if (num<=1) {
			return false;
		}
		for(int i=2;i<(num-1);i++) {
			if(num%i==0) {
				return false;
			}
			if(num==2) {
				return true;
			}
		}
		return true;
	
	}
}
