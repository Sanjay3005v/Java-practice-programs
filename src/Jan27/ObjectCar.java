package Jan27;

public class ObjectCar {
	
	public static void main(String[] args) {
		car car1 =new car();
		car1.Company="Chevrolet";
		car1.Model="Corvette";
		car1.price=700000;
		car.display(car1);
		
		car car2= new car();
		car2.Company="Ferrari";
		car2.Model="SF90";
		car2.price=75000000;
		car.display(car2);
		
		car car3=new car();
		car3.Company="Aston Martin";
		car3.Model="Valkyrie";
		car3.price=250000000;
		car.display(car3);
	
	}
}
class car{
	String Company;
	String Model;
	long price;
	public static void display(car Car) {
		System.out.println("Company:"+Car.Company);
		System.out.println("Company:"+Car.Model);
		System.out.println("Company:"+Car.price);
		System.out.println();
	}

}

