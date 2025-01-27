//Design a class for an object and initialize the state of the object using Non-static method and display the states 
//using non static method-->2 separate method to initialize and to display.


package Jan27;
public class Object2 {
	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet","Corvette",7000000);		
		car1.display();
	}
	
}
class Car{
	String Company;
	String Model;
	long price;
	public Car(String Company,String Model,long price) {
		this.Company=Company;
		this.Model=Model;
		this.price=price;
	}
	
	public void display() {
		System.out.println("Company:"+Company);
		System.out.println("Model  :"+Model);
		System.out.println("Price  :"+price);
		System.out.println();
	}
}
