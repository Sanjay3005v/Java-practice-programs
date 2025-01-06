package jan3;

public class PrimeInMulOf18Below200 {
	public static void main(String[] args) {
		System.out.println("The Prime numbers which are immediately after the multiples of 18 and below 200 are");
		for(int i=18;i<=200;i++) {
			if (i%18==1 && Primenumber(i)) {
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
		}
		return true;
	
	}
}
