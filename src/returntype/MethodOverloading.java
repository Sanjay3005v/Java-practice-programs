package returntype;

public class MethodOverloading {
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
	}
	public static void add(int a,int b){
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}	
	public static void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}			
	
	
}
