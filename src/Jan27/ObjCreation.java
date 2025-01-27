package Jan27;

public class ObjCreation {
	String  brand;
	double price;
	String ram;
	public  void display(ObjCreation Mobile) {
		
		System.out.println(Mobile.brand);
		
	}
	
	public static void main(String[] args) {
		ObjCreation Mobile= new ObjCreation();
		System.out.println(Mobile.brand);
		System.out.println(Mobile.price);
		System.out.println(Mobile.ram);
		Mobile.display(Mobile);
	}
}
