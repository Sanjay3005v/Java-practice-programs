//Design a class Laptop create three states to display the states and create a non static method 
//and create three objects initialize the states and display  the states.


package Jan28;

public class ObjectLaptop {
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop();
		Laptop laptop3 = new Laptop();
		Laptop laptop4 = new Laptop();
		laptop1.SetValue("Lenevo", "Ideapad", 50000);
		laptop2.SetValue("Lenevo", "LOQ", 70000);
		laptop3.SetValue("ASUS", "TUF", 90000);
		laptop4.SetValue("ASUS", "ROG", 150000);
		laptop1.Display();
		laptop2.Display();
		laptop3.Display();
		laptop4.Display();
	}
}
class Laptop{
	String Brand;
	String Model;
	long Price;
	
	public void SetValue(String b,String m,long p) {
		Brand=b;
		Model=m;
		Price=p;
	}
	public void Display() {
		System.out.println("-------------------");
		System.out.println("Brand:"+Brand);
		System.out.println("Model:"+Model);
		System.out.println("Price:"+Price);
		System.out.println("-------------------");
	}
}
