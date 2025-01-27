// Design a method for an Object car with three states create three car objects and assign value for three objects and print the value.



package Jan27;

public class ObjectCar {
	
	public static void main(String[] args) {
		car car1 =new car();
		car1.Company="Chevrolet";
		car1.Model="Corvette";
		car1.price=700000;
		car1.display();
		
		car car2= new car();
		car2.Company="Ferrari";
		car2.Model="SF90";
		car2.price=75000000;
		car2.display();
		
		car car3=new car();
		car3.Company="Aston Martin";
		car3.Model="Valkyrie";
		car3.price=250000000;
		car3.display();
	
	}
}
class car{
	String Company;
	String Model;
	long price;
	public void display() {
		System.out.println("Company:"+Company);
		System.out.println("Company:"+Model);
		System.out.println("Company:"+price);
		System.out.println();
	}

}

